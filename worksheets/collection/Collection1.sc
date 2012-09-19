import scala.collection.mutable.ListBuffer

object Collection1 {
  val names1 = ListBuffer("Olof")
  names1 += "Anna"
  println(names1.mkString(", "))
 
  var names2 = List("Olof")
  "Anna" :: names2

  names2 = "Anna" :: names2

  var names3 = Vector("Olof")
  names3 = "Anna" +: names3

  var names4 = Vector("Olof")
  names4 = names4 :+ "Anna"
}