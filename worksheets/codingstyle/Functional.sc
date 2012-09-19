object Functional {
  val clients = List(
    Client("Eric", List(1000, 400, 50)),
    Client("Michel", List(-10, 10, 0)),
    Client("Roger", List(0, 0, 0))
  )
  val clientsWithZeroBalance = clients.filter(_.accounts.sum == 0)

  println(clientsWithZeroBalance.mkString("\n"))
}

case class Client(name: String, accounts:List[Int])
