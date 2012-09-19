object PatternMatching3 {
  //match on types
  def waterAmount(hasWater: HasWater) = hasWater match {
    case Human    => 0.65
    case Cucumber => 0.96
    case _        => throw new Exception("Don't know..")
  }
  println(waterAmount(new Human))
}

trait HasWater
case class Human extends HasWater
case class Cucumber extends HasWater