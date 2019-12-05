package main

object TestList {

  def main(args: Array[String]): Unit = {

    //拉链
    val prices = List(5.0, 20.0, 9.95)
    val quantities = List(10, 2, 1)
    val sum = ((prices zip quantities) map {p => p._1 * p._2}) sum
    //TODO 这里为什么要空一行才行

    println(sum)
    println("Scala".zipWithIndex.max._2)

//    for (i <- (0 until 100).par) println(i + " " + Thread.currentThread().getName)

    for  (i <- (0 until 100).par) yield println(i + " " + Thread.currentThread().getName)


  }
}
