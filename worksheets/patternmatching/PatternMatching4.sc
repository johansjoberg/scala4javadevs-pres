object PatternMatching4 {
  val persons = List(
    Person("Johan", "Sjöberg", 33),
    Person("Henrik", "Andersson", 32),
    Person("Anna", "Palm", 15)
  )

  //matcher is a function of type Person => String
  val matcher = (person: Person) => person match {
    case p@Person("Johan", "Sjöberg", 33) => {
      p.firstName + " is " + p.age + " years young."
    }
    case Person(fname, _, age) if age < 18 => {
      fname + " is " + age + " years young."
    }
    case Person(fname, _, age) => {
      fname + " is " + age + " years old."
    }
  }

  //transform all persons to a list of strings
  val output = persons.map(matcher).mkString("\n")
  print(output)
}
case class Person(firstName: String, lastName: String, age: Int)