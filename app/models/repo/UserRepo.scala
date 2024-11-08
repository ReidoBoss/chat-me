package repo.user

import javax.inject._
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.PostgresProfile
import domain.user.User
import java.util.UUID

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


}
