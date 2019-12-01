package main

object TestMain {

  def main(args: Array[String]): Unit = {

    val str = "aaa"
    val sss = "aaa"
    println(str == sss)
    println(str.eq(sss))
    println(str.equals(sss))

    val enums = TestEnum.values
    println(enums)
    for(e <- enums) {
      println(e.id + ":" + e)
    }

    println(TestEnum.RED.id + " " + TestEnum.RED)
    println(TestEnum.RED.id + " " + TestEnum.RED.toString)

//    println(TestEnum.withName("red")) //没有找到会报错
    println(TestEnum.withName("red qq"))
    println(TestEnum(0))

  }

}
