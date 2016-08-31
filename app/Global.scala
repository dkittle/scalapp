import java.text.SimpleDateFormat

import models._
import org.joda.time.DateTime
import play.api._
import repositories.EmployeeDao

object Global extends GlobalSettings {

  override def onStart(app: Application) {
    StartData.insert()
  }

}

/**
  * Starting set of data to be inserted into the sample application.
  */
object StartData {

  val sdf = new SimpleDateFormat("MM/dd/yyyy")

  def insert(): Unit = {
//    val time = DateTime.now
//    val yesterday = DateTime.now.minusYears(17)
//    val dao = new EmployeeRepo()
//    if (dao.count == 0) {
//      val employees = List(
//        Employee(1L, "John", "USA", yesterday, time, "Trainee", ""),
//        Employee(1L, "Miles", "USA", yesterday, time, "Assistant", ""),
//        Employee(1L, "Alexander", "USA", yesterday, time, "Manager", ""),
//        Employee(1L, "Stefan", "USA", yesterday, time, "Trainee", ""),
//        Employee(1L, "Robin", "USA", yesterday, time, "Assistant", ""),
//        Employee(1L, "Pankaj", "India", yesterday, time, "Manager", ""),
//        Employee(1L, "Mayank", "India", yesterday, time, "Trainee", ""),
//        Employee(1L, "David", "UK", yesterday, time, "Assistant", ""),
//        Employee(1L, "Philip", "Germany", yesterday, time, "Manager", ""),
//        Employee(1L, "Fred", "USA", yesterday, time, "Trainee", ""),
//        Employee(1L, "Louis", "Canada", yesterday, time, "Assistant", ""))
//      dao.save(employees)
//    }
//    val accountDao = new AccountRepo()
//    if (accountDao.count == 0) {
//      val account = Account.quickAccount.
//        copy(full_name = "Don Kittle").
//        copy(first_name = "Don").
//        copy(last_name = "Kittle").
//        copy(email = "don@kittle.ca")
//      accountDao.save(account)
//    }
  }

}
