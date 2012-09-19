object PatternMatching1 {
  //Like Java switch statement (Value pattern matching)
  def reply(input: String) = input match {
    case "Hello"   => "Hi there!"
    case "Goodbye" => "See ya!"
    case _         => "Say what?"
  }

  println(reply("Goodbye"))
}