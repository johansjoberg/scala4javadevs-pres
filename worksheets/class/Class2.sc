object Class2 {
  val johnDoe = new Name()
  val janeDoe = new Name("Jane")
  val robSmith = new Name("Rob", "Smith")
  val annSmith = new Name(lastName = "Smith", firstName = "Ann")
}

class Name(val firstName: String = "John", val lastName: String = "Doe"){
  override def toString: String = {
    "Name(" + firstName + ", " + lastName + ")"
  }
}