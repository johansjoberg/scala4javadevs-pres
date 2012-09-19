object Function1 {
  val names = List("Adam", "Stellan", "Emma", "Li")

  val countLength: String => Int = (input: String) => input.length()

  for(name <- names) yield countLength(name)
}