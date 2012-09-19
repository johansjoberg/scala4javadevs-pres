object Class1 {
  val johnDoe = new Name()
  val janeDoe = new Name("Jane")
  val robSmith = new Name("Rob", "Smith")
  val annSmith = new Name(lastName = "Smith", firstName = "Ann")
} 

class Name(val firstName: String, val lastName: String){
 
  def this(firstName: String) = this(firstName, "Doe")

  def this() = this("John")

  override def toString: String = {
    "Name(" + firstName + ", " + lastName + ")"
  }
}