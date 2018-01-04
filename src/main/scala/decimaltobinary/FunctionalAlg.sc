0.to(10).toList

val rands = Iterator.continually(Math.random())

rands.take(5).toList

val plusOne = Iterator.iterate(6)(n => n + 1)

plusOne.take(5).toList

val divideByTwo = Iterator.iterate(183)(n => n / 2)

divideByTwo.takeWhile(n => n > 0).toList

plusOne.take(5).map(n => n * 2).toList

def decimalToBinary(n: Int): String = {
  val divByTwo = Iterator.iterate(n)(x => x / 2)
  val binary = divByTwo
    .takeWhile(x => x > 0)
    .map(x => x % 2)
  binary.mkString.reverse
}
decimalToBinary(183)

def decimalToBinary2(n: Int): String = {
  val divByTwo = Iterator.iterate(n){x =>
    println("DIV")
    x / 2}
  val binary = divByTwo
    .takeWhile{x =>
      println("TAKEWHILE")
      x > 0}
    .map{x =>
      println("MAP\n")
      x % 2}
  binary.mkString.reverse
}
decimalToBinary2(183)