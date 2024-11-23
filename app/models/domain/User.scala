package domain.user

import java.util.UUID
import play.api.data._
import play.api.data.Forms._
import org.mindrot.jbcrypt.BCrypt

case class User (
  firstName:String,
  middleName:String,
  lastName: String,
  username: String,
  email: String,
  password: String,
  id: UUID = UUID.randomUUID()
) {

  def withHashedPassword:User = {
    new User (
      firstName,
      middleName,
      lastName,
      username,
      BCrypt.hashpw(password,BCrypt.gensalt()),
      email
    )
  }

  def comparePass( hashedPassword: String): Boolean = {
    BCrypt.checkpw(password, hashedPassword)
  }
}

object User {

  def apply(
    firstName:String,
    middleName:String,
    lastName: String,
    username: String,
    password: String,
    email: String
  ) = {
    new User(firstName,middleName,lastName,username,password,email)
  }

  def unapply (user:User) = {
    Some((
      user.firstName,
      user.middleName,
      user.lastName,
      user.username,
      user.password,
      user.email
    ))
  }
}

def userForm = Form(
  mapping(
    "firstName" -> text,
    "middleName" -> text,
    "lastName" -> text,
    "username" -> text,
    "password" -> text,
    "email" -> text
  )(User.apply)(User.unapply)
)
