object Collection3 {
  val persons = List(
    Person("John Taylor", 40),
    Person("Anne Edwards", 50),
    Person("Pete Smith", 9)
  )
  val filteredAboveTen = persons.filter(_.age > 10)
  val (aboveTen, tenAndBelow) = persons.partition(_.age > 10)
  val names = persons.map(_.name)
}

case class Person(name: String, age: Int)