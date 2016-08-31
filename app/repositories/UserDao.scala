package repositories

import models.User

class UserDao extends QaDao {

  import qadb._

  val saveUsers = quote(query[User].schema(_.generated(_.id)).insert)
  val usersQuery = quote(query[User])

  def count = qadb.run(usersQuery.size)

  def save(user: User) = qadb.run(saveUsers)(List(user))

  def save(users: List[User]) = qadb.run(saveUsers)(users)

  def list(offset: Int, count: Int) = qadb.run(usersQuery.drop(lift(offset)).take(lift(count)))

  def findById(id: Long) = qadb.run(usersQuery.filter(_.id == lift(id)))

}

