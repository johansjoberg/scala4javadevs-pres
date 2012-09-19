object ForComprehension1 {
  val names = List("Abraham", "Anna", "Ella", "Tomas", "Stellan")

  //Similar to Java for-loop
  var namesLongerThanFourChars = List[String]()
  for(name <- names){ 
    if(name.length > 4) {
      // :: operator means prepend name to namesLongerThanFourChars
      // and create a new list
      namesLongerThanFourChars = name :: namesLongerThanFourChars
    }
  }

  println(namesLongerThanFourChars.mkString(", "  ))
}
