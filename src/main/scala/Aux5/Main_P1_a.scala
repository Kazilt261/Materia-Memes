package Aux5
class A {
  def foo(): Unit = {
    println("a.foo")
  }
  def bar(): Unit = {
    println("a.bar")
    this.foo()
  }
  def baz(): Unit = {
    println("a.baz")
  }
}

class B extends A {
  override def foo(): Unit = {
    println("b.foo")
    this.baz()
  }
  override def baz(): Unit = {
    println("b.baz")
    super.foo()
  }
}
object Main_P1_a {
  def main(args: Array[String]): Unit = {
    val a: A = new A
    val b: A = new B
    b.bar()
  }
}
