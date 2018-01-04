def decimalToBinary(n: Int): String = {
  var x = n
  var binaryString = ""
  while (x > 0) {
    binaryString += (x % 2)
    x /= 2
  }
  binaryString.reverse
}
decimalToBinary(183)

def decimalToBinaryStack(n: Int): String = {
  var x = n
  var stack = List[Int]()
  while (x > 0) {
    stack = (x % 2) +: stack
    x /= 2
  }
  stack.mkString
}

decimalToBinaryStack(183)