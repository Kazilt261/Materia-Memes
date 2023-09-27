package P1_Preguntas_C
class Vehicle {
  def start(): Unit = {
    println("Vehicle started")
  }

  def stop(): Unit = {
    println("Vehicle stopped")
  }
}

class Car extends Vehicle {
  override def start(): Unit = {
    super.start()
    println("Car started")
  }

  override def stop(): Unit = {
    println("Car stopped")
    super.stop()
  }
}


object Main {
  def main(args: Array[String]): Unit = {
    val car: Vehicle = new Car()
    car.start()
    car.stop()
  }
}
