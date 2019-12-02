package main

import scala.io.Source

object TestFile {

  def main(args: Array[String]): Unit = {

    //打印当前文件路径 /D:/workspace-idea/scala-pro-exer/target/classes/  这个路径和哪个目录是源代码目录有关。。。层级很乱。。
    println(this.getClass.getProtectionDomain.getCodeSource.getLocation.getPath)

    val prePath = this.getClass.getProtectionDomain.getCodeSource.getLocation.getPath
//    val path = this.getClass.getResourceAsStream("./file/The_man_of_property.txt")
//    println(path)

    val file = Source.fromFile(prePath + ".\\main\\file\\The_man_of_property.txt", "UTF-8")
    val lines = file.getLines()

//    for (line <- lines)
//      println(line)

    // 会一个字符一个字符地打印出来
//    for (c <- file)
//      println(c)

//    val tokens = file.mkString.split(" ")
//    for(n <- tokens) println(n)

    file.close()

    val sourceBD = Source.fromURL("http://www.baidu.com", "UTF-8")
    println(sourceBD.mkString)

    val strSource = Source.fromString("I like Scala")
    println(strSource.mkString)

//    val stdinSource = Source.stdin //TODO 怎么读取、怎么停止
//    println(stdinSource.mkString)


  }

}
