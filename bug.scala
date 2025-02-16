```scala
class MyClass(val name: String) {
  private var _age: Int = 0

  def age: Int = _age

  def age_=(newAge: Int): Unit = {
    if (newAge >= 0) _age = newAge
    else throw new IllegalArgumentException("Age cannot be negative")
  }
}

object Main extends App {
  val myObject = new MyClass("John")
  myObject.age = 30
  println(myObject.age) // Output: 30

  // This line will throw an exception because age cannot be set to negative
  myObject.age = -10
}
```