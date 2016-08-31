package controllers.crud

import play.api.mvc.{Action, Controller}
import repositories.UserDao
import utils.JsonUtils

class UserController extends Controller with JsonUtils {

  val userDao = new UserDao()

  def list(offset: Int, count: Int) = Action { implicit rs =>
    val users = userDao.list(offset, count)
    Ok(toJson(users)).as(JsonType)
  }

}
