object CaseClass {
  val johan = Person("Johan", "Sj�berg", 33)
  val otherJohan = johan.copy(age = 50)
}

case class Person( firstName: String, lastName: String, age: Int)
