package sequences

object Launcher {

  def main(args: Array[String]): Unit = {
    val aGenerator = new ArithmeticGenerator(0, 5)
    println(aGenerator.generateStr(10))

    val gGenerator = new GeometricGenerator(1, 3)
    println(gGenerator.generateStr(10))

    val fGenerator = new FibonacciGenerator()
    println(fGenerator.generateStr(10))
  }
}
