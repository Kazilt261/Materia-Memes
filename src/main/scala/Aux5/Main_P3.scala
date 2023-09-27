package Aux5

class D() {
  def foo(d: D): Unit = {
    println("d.foo")
  }
  def foo(e: E): Unit = {
    println("d.foo_1")
  }
  def bar(f: F): Unit = {
    println("d.bar")
  }
}
class E extends D {
  def foo(f: F): Unit = {
    println("e.foo")
    this.foo(this)
  }
}
class F extends E {
  override def foo(f: F): Unit = {
    println("f.foo")
    super.foo(this)
  }
  def bar(d: D): Unit = {
    println("f.bar")
  }
}

object Main_P3 {
  def main(args: Array[String]): Unit = {
    val d: D = new D()
    val e: D = new E()
    val f: F = new F()
    f.foo(f)
  }
}

