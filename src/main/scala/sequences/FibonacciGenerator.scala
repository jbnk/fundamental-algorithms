package sequences

class FibonacciGenerator extends SequenceGenerator {

  val streamFib:Stream[Int] = 1 #:: 1 #:: streamFib.zip(streamFib.tail).map(t => t._1 + t._2)

  override def generate(total: Int): List[Int] = streamFib.take(total).toList

//  override def generate(total: Int): List[Int] = {
//    val sequence = Array.fill(total)(0)
//    sequence(0) = 1
//    sequence(1) = 1
//    for (n <- 2 until total) {
//      sequence(n) = sequence(n-1) + sequence(n-2)
//    }
//    sequence.toList
//  }
}
