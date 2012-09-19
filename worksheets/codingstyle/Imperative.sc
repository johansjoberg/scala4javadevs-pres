object Imperative {
  val clients = List(
    Client("Eric", List(1000, 400, 50)),
    Client("Michel", List(-10, 10, 0)),
    Client("Roger", List(0, 0, 0))
  )
  var clientsWithZeroBalance = List[Client]()
  for(client <- clients){
    var sum = 0
    for(account <- client.accounts) {
      sum += account
    }
    if(sum == 0){
      clientsWithZeroBalance = client :: clientsWithZeroBalance
    }
  }

  println(clientsWithZeroBalance.mkString("\n"))
}

case class Client(name: String, accounts:List[Int])
