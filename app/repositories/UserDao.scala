package repositories

import models.User

class UserDao extends QaDb {

  import qadb._

  val dataQuery = quote(query[User])

  def count() = qadb.run(dataQuery.size)

  def save(user: User) = qadb.run(quote(query[User].insert(lift(user)).returning(_.id)))

  def list(offset: Int, count: Int) = qadb.run(dataQuery.drop(lift(offset)).take(lift(count)))

  def findById(id: Long) = qadb.run(dataQuery.filter(_.id == lift(id)))

}

