package services

import models.{Credentials, Person}

/**
  * Created by dell on 3/8/2017.
  */
class SignupRepo {
  val dataList: List[Person] = List.empty

  def validatePerson(credentials: Credentials): Boolean = {
    val list = dataList filter (data => (data.credentials.userName == credentials.userName
      && data.credentials.password == credentials.password))
    if (list.isEmpty) false
    if (list.size == 1) true
    else {
      throw new Exception("Should not happen - duplicate userName found")
    }
  }

  def addPerson(person: Person) = {
    dataList :+ person
  }

}