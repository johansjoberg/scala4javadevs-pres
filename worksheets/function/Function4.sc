object Function4 {
  val names = List("Adam", "Stellan", "Emma", "Li")

  val nameLength1 = names.map(_.length())

  val nameLength2 = names.map( name => name.length())
}