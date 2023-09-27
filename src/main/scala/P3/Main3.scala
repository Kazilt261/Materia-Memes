package P3
class A {
  def foo(): Unit = {
    println("A.foo")
  }
  def bar(a: A): Unit = {
    println("A.bar: " + eq(a))
  }
  def eq(o: A): Boolean = {
    println("A.eq")
    this.getClass == o.getClass
  }

}
class B extends A {
  override def foo(): Unit = {
    println("B.foo")
    this.bar(new C)
  }
  override def bar(a: A): Unit = {
    println("B.bar")
    super.bar(a)
  }
  def eq(o: B): Boolean = {
    println("B.eq")
    this.getClass == o.getClass
  }
  def baz(): Unit = {
    println("B.baz")
  }
}
class C extends B {
  override def bar(a: A): Unit = {
    println("C.bar: " + eq(a))
  }
}
object Main3 {
  def main(args: Array[String]): Unit = {
    val a: A = new B();
  }
}
