```scala
class MyClass(val name: String) {
  private var _age: Int = 0

  def age: Int = _age

  def age_=(newAge: Int): Unit = {
    _age = Math.max(0, newAge) // Use Math.max to ensure age is never negative
  }
}

object Main extends App {
  val myObject = new MyClass("John")
  myObject.age = 30
  println(myObject.age) // Output: 30

  // This line won't throw an exception, age will be 0
  myObject.age = -10
  println(myObject.age) // Output: 0
}
```