package example

object ScalaTour {
  def main(args: Array[String]): Unit = {
    val message = "Hello world"
    println(message)
    fizzBuzz(100)
  }

  def fizzBuzz(n :Int): Unit = for (i <-  1 to n) {
    if (i % 15 == 0) {
      println("FizzBuzz")
    } else if (1 % 3 == 0) {
      println("Fizz")
    } else if (i % 5 == 0) {
      println("Buzz")
    } else {
      println(i)
    }
  }
}
