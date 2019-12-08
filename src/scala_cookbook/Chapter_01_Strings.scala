package scala_cookbook

object Chapter_01_Strings extends App {
  "hello".foreach(println)

  val s: String = "Hello"
  s.getBytes.foreach(println)

  val ss = s.drop(2)
  println(ss)

  val sss = s.take(2).capitalize;
  println(sss)

  val foo =
    """
      |abc
      |def
      |""".stripMargin.replaceAll("\n", " ")
  println(foo)

  val splitter = raw"\d"
  val str = "ka1dj2fa4kdjf"
  val res = str.split(splitter).mkString("-NUM-")


  println(s"$str splitted with $splitter gives $res")

}
