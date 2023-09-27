package P2_Preguntas_C
class A {
  private val x: Int = 1

  def f(): Unit = {
    println(x)
  }
}

class B extends A {
  val x: Int = 2
}


object Main {
  def main(args: Array[String]): Unit = {
    val a: A = new B()
    a.f()
  }
}
