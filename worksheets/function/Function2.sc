object Function2 {
  val names = List("Adam", "Stellan", "Emma", "Li")

  val countLength: String => Int = (input: String) => input.length()

  val nameLength = names.map(countLength)
}