package controllers.crud

import javax.inject.Inject

import play.api.mvc.{Action, Controller}
import repositories.UserDao
import utils.JsonUtils


class UserController @Inject()(userDao: UserDao)
  extends Controller with JsonUtils {

  def list(offset: Int, count: Int) = Action { implicit rs =>
    val users = userDao.list(offset, count)
    Ok(toJson(users)).as(JsonType)
  }

}
