object Declarative {
  val clients = List(
    Client("Eric", List(1000, 400, 50)),
    Client("Michel", List(-10, 10, 0)),
    Client("Roger", List(0, 0, 0))
  )
  val clientsWithZeroBalance = for(
    client <- clients
    if client.accounts.sum == 0
  ) yield client

  println(clientsWithZeroBalance.mkString("\n"))
}

case class Client(name: String, accounts:List[Int])
