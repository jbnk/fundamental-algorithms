val it = Iterator.iterate(1)(n => n +n)
it.take(10).toList

val sampleList = List(1, 2, 3)

val sampleList2 = 1 :: 2 :: 3 :: Nil

val stream = 1 #:: 2 #:: 3 #:: Stream.empty

stream(2)

val streamRand = Stream.continually(math.random())

streamRand(1)
streamRand(3)

streamRand(1)
streamRand(3)

val list1 = List("A", "B", "C")

val list2 = List("a", "b", "c")

list1.head
list1.tail

list1.zip(list2).map(t => t._1 + t._2)
list1.zip(list2.tail).map(t => t._1 + t._2)

val listFib = List(1,1,2,3,5)
listFib.zip(listFib.tail).map(t => t._1 + t._2)

val streamFib:Stream[Int] = 1 #:: 1 #:: streamFib.zip(streamFib.tail).map(t => t._1 + t._2)

streamFib.take(10).toList