object Collection2 {
  val numbers1 = List.range(1,10)
  val sameNumbers = 1 until 10

  val sumOfBoth = numbers1.sum + sameNumbers.sum

  val numbers2 = List(1,4,2,3,10,9)
  val count = numbers2.count(_ > 5)
  val sorted = numbers2.sorted
}