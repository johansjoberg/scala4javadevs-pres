object PatternMatching2 {
  //Variable/Value pattern matching
  def whichMedal(position: Int) = position match {
    case 1        => "Gold"
    case 2        => "Silver"
    case 3        => "Bronze"
    case loserPos => "You don't get medals for position " + loserPos
  }

  print(whichMedal(4))
}