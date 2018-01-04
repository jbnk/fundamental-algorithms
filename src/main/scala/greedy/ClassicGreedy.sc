import scala.collection.mutable.ListBuffer

val lengsts = Array(10, 5, 2, 1)

def whichReels(p: Int): List[Int] = {
  val reels = ListBuffer[Int]()
  var x = p
  while (x > 0) {
    var i = 0
    while (lengsts(i) > x) i += 1
    reels += lengsts(i)
    x -= lengsts(i)
  }
  reels.toList
}

whichReels(29)
whichReels(16)

val z = 10
val strZ = if (z > 5) {
  "more"
} else {
  "less"
}

def whichReelsRec(p: Int): List[Int] = {
  if (p == 0) Nil
  else {
    var i = 0
    while (lengsts(i) > p) i += 1
    lengsts(i) :: whichReelsRec(p - lengsts(i))
  }
}

whichReelsRec(29)
whichReelsRec(16)