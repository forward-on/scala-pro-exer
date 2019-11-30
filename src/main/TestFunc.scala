import scala.collection.mutable.ArrayBuffer

object TestFunc {
  def main(args: Array[String]): Unit = {
//    println("xxx")
//    val test = new Test("ddd", 1)
//    println(test)
//    println(test.desc)
//    testArray
    testArrayBuffer
  }

  def testArray():Unit = {
    val fixarr = new Array[Int](10)
    fixarr(0) = 1
    println(fixarr(0))

    for (i <- 0 until fixarr.length) {
      fixarr(i) = i
    }

    for (i <- fixarr.indices) {
      print(fixarr(i) + " ")
    }

    println("sum === " + fixarr.sum)

    val sorted = fixarr.sorted.reverse
    println(sorted.mkString(","))

    // 定义一个隐式排序，sorted会自定义使用该排序规则
    implicit  val intOrdering = new Ordering[Int]{
      override def compare(x: Int, y: Int): Int = {
        -x.compareTo(y)
      }
    }
    val implicitArr = fixarr.sorted
    println(implicitArr.mkString(","))

    val sortWithArr = fixarr.sortWith((a:Int, b:Int) => a.compareTo(b) > 0)
    println(sortWithArr.mkString("<", ",", ">"))

    scala.util.Sorting.quickSort(sortWithArr)
    for (ele <- sortWithArr) {
      print(ele + " ")
    }


  }

  def testArrayBuffer():Unit = {
    val buffer = ArrayBuffer[Int]()

    buffer += (33,34,35) // 尾部添加
    printElement(buffer)
    buffer.insert(2, 2)
    printElement(buffer)
    buffer ++= Array(6,6,6,6) // ++=可以追加任何集合
    printElement(buffer)
    buffer.remove(2)
    printElement(buffer)
    buffer.trimEnd(1)
    printElement(buffer)
    printElementSpaceN(buffer, 2)
    printElementSpaceNReverse(buffer, 3) //反向输出，是取正向输出的值后反向输出
    printElementForeach(buffer)

    val twoMultiArrayBuffer = for (ele <- buffer if ele % 2 == 0) yield 2 * ele
    printElement(twoMultiArrayBuffer)

    val twoMultiArrayBuffer2 = buffer.filter(_ % 2 == 0).map(_ * 2)
    printElement(twoMultiArrayBuffer2)

    val twoMultiArrayBuffer3 = buffer.filter{_ % 2 == 0}map{_ * 2}
    printElement(twoMultiArrayBuffer3)

    val count = buffer.count(_>0)
    println(count)

  }

  def printElement(buf : ArrayBuffer[Int]):Unit = {
    for (i <- buf.indices) {
      print(buf(i) + " ")
    }
    println()
  }

  /**
    * 增强for循环
    * @param buf
    */
  def printElementForeach(buf : ArrayBuffer[Int]):Unit = {
    for (element <- buf.toArray) {
      print(element + " ")
    }
    println()
  }

  def printElementSpaceN(buf : ArrayBuffer[Int], space: Int = 1):Unit = {
    for (i <- 0 until (buf.size, space)) {
      print(buf(i) + " ")
    }
    println()
  }

  def printElementSpaceNReverse(buf : ArrayBuffer[Int], space: Int = 1):Unit = {
    for (i <- (0 until (buf.size, space)).reverse) {
      print(buf(i) + " ")
    }
    println()
  }



}
