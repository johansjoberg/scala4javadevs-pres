object ForComprehension2 {
  val names = List("Abraham", "Anna", "Ella", "Tomas", "Stellan")

  //Preferred way in Scala
  val namesLongerThanFourChars = for(
    name <- names
    if name.length > 4
  ) yield name

  println(namesLongerThanFourChars.mkString(", "))
}