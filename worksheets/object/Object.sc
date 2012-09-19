object Object {
  val johnDoe1 = Name.apply()
  val johnDoe2 = Name()

  val janeDoe = Name.nameChild(johnDoe1, "Jane")
  val robSmith = Name("Rob", "Smith")
  val annSmith = Name(lastName = "Smith", firstName = "Ann")
}

//Same Name class as in Class-section
class Name(val firstName: String = "John", val lastName: String = "Doe"){
  override def toString: String = {
    "Name(" + firstName + ", " + lastName + ")"
  }
}

//Companion object
object Name {
def apply(firstName: String = "John", lastName: String = "Doe") = {
  new Name(firstName, lastName)
}

  def nameChild(parentName: Name, childFirstName: String) = {
    Name(childFirstName, parentName.lastName)
  }
}