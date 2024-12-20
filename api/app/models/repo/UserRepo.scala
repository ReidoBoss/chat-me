package repo.user

import javax.inject._
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.PostgresProfile
import domain.user.User
import java.util.UUID
import scala.concurrent.Future

@Singleton
class UserRepository @Inject() (val dcp:DatabaseConfigProvider) {

  val dbConfig = dcp.get[PostgresProfile]
  import dbConfig._
  import profile.api._

  class UserTable (tag:Tag) extends Table[User](tag,"USERS") {
    def id = column[UUID]("ID", O.PrimaryKey)
    def firstName = column[String]("FIRST_NAME")
    def middleName = column[String]("MIDDLE_NAME")
    def lastName = column[String]("LAST_NAME")
    def username = column[String]("USERNAME")
    def email = column[String]("EMAIL")
    def password = column[String]("PASSWORD")
    def * = (firstName,middleName,lastName,username,email,password,id).mapTo[User]
  }

  val users = TableQuery[UserTable]

  def getByUsername (username:String):Future[Option[User]] = {
    val action = users.filter(_.username === username).result.headOption
    db.run(action)
  }

  def getByEmail (email:String):Future[Option[User]] = {
    val action = users.filter(_.email === email).result.headOption
    db.run(action)
  }

  def add ( user:User ):Future[Int] = {
    val action = users += user.withHashedPassword
    db.run(action)
  }

}
