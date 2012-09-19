object CaseClass {
  val johan = Person("Johan", "Sjöberg", 33)
  val otherJohan = johan.copy(age = 50)
}

case class Person( firstName: String, lastName: String, age: Int)
