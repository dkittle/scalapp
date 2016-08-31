package repositories

import models.Employee

class EmployeeDao extends BaseDao {

  import ctx._

  val saveEmployees = quote(query[Employee].schema(_.generated(_.id)).insert)
  val employeeQuery = quote(query[Employee])

  def count =
    ctx.run(employeeQuery.size)

  def save(employee: Employee) =
    ctx.run(saveEmployees)(List(employee))

  def save(employees: List[Employee]) =
    ctx.run(saveEmployees)(employees)

  def list() = ctx.run(employeeQuery)

  def findById(id: Long) = ctx.run(employeeQuery).filter(_.id == id).head

}
