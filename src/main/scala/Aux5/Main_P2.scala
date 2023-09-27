package Aux5

class C (val x: Int) {
  print("a")
  def this(x: Int, y: Int) = {
    this(x+y)
    new C("1", "2")
    print("c2")
  }
  def this(x: String, y: String) = {
    this(x.toInt + y.toInt)
    print("c3")
  }
  def this(x: String) = {
    this(x.toInt, 5)
    print("c4")
  }
  def this() = {
    this("1")
    print("c5")
  }
  print("b")
}

object Main_P2 {
  def main(args: Array[String]): Unit = {
    new C()
  }
}
