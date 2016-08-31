package controllers

import models.Employee
import play.api.libs.json.Json._
import play.api.libs.json._
import play.api.mvc.{Action, BodyParsers, Controller}
import repositories.EmployeeDao
import utils.JsonUtils


class Application extends Controller with JsonUtils {

  import Employee._

  val dao = new EmployeeDao()

  def index = Action {
    Ok(toJson(dao.list()))
  }

  def list = Action { implicit rs =>
    val employees = dao.list()
    Ok(toJson(employees))
  }

  def show(id: Long) = Action { implicit rs =>
    val employee = dao.findById(id)
    Ok(toJson(employee))
  }


  def createEmployee = Action(BodyParsers.parse.json) { implicit rs =>
    val employee: Employee = rs.body.toString()
    try {
      dao.save(employee)
      Ok(Json.obj("status" -> "OK", "message" -> ("Emmployee '" + employee.name + "' saved.")))
    }
    catch {
      case e: Exception => InternalServerError(Json.obj("status" -> "KO", "message" -> e.getMessage))
    }

  }

}
