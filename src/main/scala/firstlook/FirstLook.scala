package firstlook

object FirstLook {

  def main(args: Array[String]): Unit = {
    val exampleFunctions = new ExampleFunctions()
    println(s"The square of 4 is ${exampleFunctions.square(4)}")
    println(s"The cube of 4 is ${exampleFunctions.cube(4)}")
  }
}
