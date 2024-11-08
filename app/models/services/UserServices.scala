package services.user

import repo.user.UserRepository
import domain.user.{ User }

import scala.concurrent.{ Future, ExecutionContext }
import javax.inject._


@Singleton
class UserServices @Inject()(
  userRepo: UserRepository
)(using ExecutionContext){

  def add (user:User) = {

  }

}
