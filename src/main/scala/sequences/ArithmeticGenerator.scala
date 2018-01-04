package sequences

class ArithmeticGenerator(start: Int, difference: Int) extends SequenceGenerator {

  override def generate(total: Int): List[Int] = {
//    val sequence = Array.fill(total)(0)
//    var x = start
//    for (n <- 0 until total) {
//      sequence(n) = x
//      x += difference
//    }
//    sequence.toList
    (0 until total)
      .map(n => start + n * difference)
      .toList
  }
}
