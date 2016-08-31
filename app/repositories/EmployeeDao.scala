package repositories

import models.Employee

class EmployeeDao extends TestDb {

  import ctx._

  val employeeQuery = quote(query[Employee])

  def count = ctx.run(employeeQuery.size)

  def save(employee: Employee) = ctx.run(quote(query[Employee].insert(lift(employee)).returning(_.id)))

  def list(offset: Int, count: Int) = ctx.run(employeeQuery.drop(lift(offset)).take(lift(count)))

  def findById(id: Long) = ctx.run(employeeQuery.filter(_.id == lift(id)))

}
