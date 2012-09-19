object Function3 {
  val names = List("Adam", "Stellan", "Emma", "Li")

  def countLength(input: String) = input.length()

  val nameLength1 = for(name <- names) yield countLength(name)
  val nameLength2 = names.map(countLength)
}