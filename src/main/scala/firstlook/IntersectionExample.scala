package firstlook

object IntersectionExample {

  def intersection(x: List[Int], y: List[Int]): List[Int] = x.filter(i => y.contains(i))

  def main(args: Array[String]): Unit = {
    println(intersection(List(1,2,3,4,5), List(4,5,6)))
  }
}
