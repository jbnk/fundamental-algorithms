val lengths = Array(10, 5, 2, 1)

val sampleP = 29
lengths.map(len => sampleP / len)

lengths.foldLeft(sampleP) { (p, len) =>
  val multiple = p / len
  println(s"we can buy $multiple reels of length $len")
  p - multiple * len
}

case class Choice(p: Int, reels: List[Int])

def whichReels(p: Int): List[Int] = {
  val finalChoice = lengths.foldLeft(Choice(p, List())) { (choice, len) =>
    val multiple = choice.p / len
    val reelsToBuy = List.fill(multiple)(len)
    Choice(choice.p - multiple * len, choice.reels ::: reelsToBuy)
  }
  finalChoice.reels
}

whichReels(16)