import scala.collection.parallel.CollectionConverters._

//def main(args: Array[String]): Unit = {
  //println("HI")
//}

object ParallelPiCalculation {
  def calculatePi(numSteps: Int): Double = {
    val step = 1.0 / numSteps
    val sum = (0 until numSteps).toList.par.map { i =>
      val x = (i + 0.5) * step
      4.0 / (1.0 + x * x)
    }.sum

    step * sum
  }

  def main(args: Array[String]): Unit = {
    println("Pi: " + calculatePi(100000000))
  }
}