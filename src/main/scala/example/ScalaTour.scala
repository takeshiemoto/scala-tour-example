package example

object ScalaTour {
  def main(args: Array[String]): Unit = {
    val message = "Hello world"
    println(message)
    fizzBuzz(100)
    fizzBuzzForMatch(100)
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

  def fizzBuzzForMatch(n: Int): Unit = for (i <- 1 to n) {
    i match {
      case x if x % 15 == 0 =>
        println("FizzBuzz")
      case x if x % 3 == 0 =>
        println("Fizz")
      case x if x % 5 == 0 =>
        println("Buzz")
      case x =>
        println(x)
    }
  }
}
