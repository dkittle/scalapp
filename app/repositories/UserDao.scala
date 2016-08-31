package repositories

import models.User

class UserDao extends QaDb {

  import qadb._

  val saveData = quote(query[User].schema(_.generated(_.id)).insert)
  val dataQuery = quote(query[User])

  def count() = qadb.run(dataQuery.size)

  def save(user: User) = qadb.run(saveData)(List(user))

  def save(users: List[User]) = qadb.run(saveData)(users)

  def list(offset: Int, count: Int) = qadb.run(dataQuery.drop(lift(offset)).take(lift(count)))

  def findById(id: Long) = qadb.run(dataQuery.filter(_.id == lift(id)))

}

