package models

import java.time.LocalDateTime

import utils.JsonUtils

case class Employee(
                     id: Long,
                     name: String,
                     address: String,
                     dateOfBirth: LocalDateTime,
                     joiningDate: LocalDateTime,
                     designation: String,
                     json: String
                   )

object Employee extends JsonUtils {

  implicit def createEmployee(json: String): Employee = fromJson[Employee](json)

}