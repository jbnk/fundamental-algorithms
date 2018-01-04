package sequences

class GeometricGenerator(start: Int, ratio: Int) extends SequenceGenerator {

  override def generate(total: Int): List[Int] = {
//    val sequence = Array.fill(total)(0)
//    var x = start
//    for (n <- 0 until total) {
//      sequence(n) = x
//      x *= ratio
//    }
//    sequence.toList
    (0 until total)
      .map(n => start * math.pow(ratio, n).toInt)
      .toList
  }
}
