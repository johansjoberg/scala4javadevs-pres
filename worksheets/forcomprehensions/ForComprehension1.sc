object ForComprehension1 {
  val names = List("Abraham", "Anna", "Ella", "Tomas", "Stellan")

  //Imperative - Java-like
  var namesLongerThanFourChars = List[String]()
  for(name <- names){
    if(name.length > 4) {
      // :: operator means append name to namesLongerThanFourChars
      // and create a new list
      namesLongerThanFourChars = name :: namesLongerThanFourChars
    }
  }

  println(namesLongerThanFourChars.mkString(", "  ))
}