object IfExpression {
  val number = 10
  val opinion = if(number > 5) {
    "This number is too big"
  } else {
    "I like this number!"
  }

  println(opinion)
}