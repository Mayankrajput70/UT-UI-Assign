package com.knoldus.db

import com.knoldus.models.Employee
import scala.collection.immutable.HashMap

class EmployeeReadDto {

  val MayankEmployee: Employee = Employee("Mayank","Rajput",22,12000,"Intern","knoldus","mayank.rajput@knoldus.com")
  val AmanEmployee: Employee = Employee("Aman","singh",24,15000,"Software Engineer","Philips","aman.singh@philips.com")

  val employees: HashMap[String, Employee] = HashMap("Mayank" -> MayankEmployee, "Aman" -> AmanEmployee)
  def getEmployeeByName(name: String): Option[Employee] = employees.get(name)

}
