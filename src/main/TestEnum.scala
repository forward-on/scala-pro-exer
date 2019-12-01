package main

object TestEnum extends Enumeration {

  val RED = Value("red qq") // 不指定id，默认从0开始，在前一个基础上加一
  val YELLOW = Value(2, "yellow aa")
  val GREEN = Value

}
