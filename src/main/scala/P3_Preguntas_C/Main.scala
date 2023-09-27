package P3_Preguntas_C
class A {
  def m1(): String = {
    "A.m1"
  }
  def m2(): String = {
    s"A.m2 > ${this.m1()}"
  }
  def m5(): String = {
    s"A.m5 > ${this.m2()}"
  }
}

class B extends A() {
  override def m1(): String = {
    "B.m1"
  }
  def m3(): String = {
    s"B.m3 > ${super.m1()}"
  }
  def m4(): String = {
    s"B.m4 > ${super.m2()}"
  }
  override def m5(): String = {
    s"B.m5 > ${super.m5()}"
  }
}

class C extends B() {
  override def m2(): String = {
    s"C.m2 > ${this.m1()}"
  }
}
object Main {
  def main(args: Array[String]): Unit = {
    println(s"1. ${new C().m1()}")
    println(s"2. ${new B().m1()}")
    println(s"3. ${new A().m1()}")
    println(s"4. ${new C().m2()}")
    println(s"5. ${new B().m2()}")
    println(s"6. ${new A().m2()}")
    println(s"7. ${new B().m3()}")
    println(s"8. ${new C().m4()}")
    println(s"9. ${new C().m5()}")
  }
}
