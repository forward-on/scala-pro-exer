package main

object TestMapTuple {

//  println(args(0))

  def main(args: Array[String]): Unit = {

//    testMap

    testTuple

  }

  def testMap(): Unit = {

    val firstMap = scala.collection.mutable.Map[String, Int](("a", 1))
    firstMap("a") = 2
    println(firstMap("a"))
    println(firstMap.getOrElse("b", 0))
    firstMap += (("b", 22))
    firstMap("hh") = 9
    println(firstMap.getOrElse("b", 0))
    firstMap += ("two" -> 2, "three" -> 3)
    println(firstMap.keys)
    firstMap -= "two"
    println(firstMap.keys)

    val fixMap = Map[String, Int]("two" -> 2, "three" -> 3)
    println(fixMap("two"))
    var otherMap = fixMap + (("three", 33), ("aa", 3))
    println(otherMap("three"))
    otherMap = otherMap - "aa"
    //    println(otherMap("aa"))

    println("================")

    val map1 = Map[String, Int]("aa"->1, "a"->2, "d" -> 4, "c"-> 3)
    mapForEach(map1)

    val map2 = scala.collection.immutable.SortedMap[String, Int]("aa"->1, "a"->2, "d" -> 4, "c"-> 3)
    mapForEach(map2)
  }

  def mapForEach(map : Map[String, Int]) : Unit = {
    for (key <- map.keySet) println(key + ":" + map(key))
  }

  def testTuple(): Unit ={

    val t = (1, 2.33, "add")
    println(t._2)
    println(t _2) // 使用 t _2 亦可以，中间是空格
    val (a, _, b) = t // 不需要的位置使用_
    println(b)

    val t2 = "Good Morning".partition(_.isUpper)
    println(t2._2)

  }

}
