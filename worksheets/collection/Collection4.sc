import collection.GenSeq

object Collection4 {
  //method for measuring the time of the execution
  def measureTime(workers: List[Worker])
                 (work: GenSeq[Worker] => GenSeq[String]) = {
    val start = System.currentTimeMillis()
    work(workers)
    val stop = System.currentTimeMillis()
    stop - start
  }

  val workers = List.fill(100)(Worker(100)) //create 100 Workers

  val sequentialTime = measureTime(workers){
    _.map(_.work())
  }
  val parallelTime = measureTime(workers){
    _.par.map(_.work())
  }
}

case class Worker(workInMs: Long) { //class for simulating work
  def work() = {
    Thread.sleep(workInMs)
    "Done!"
  }
}