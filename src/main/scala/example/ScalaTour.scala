package example

object ScalaTour {
  def main(args: Array[String]): Unit = {
    fizzBuzzForRecursive(15)
  }

  def fizzBuzz(n: Int): Unit = for (i <- 1 to n) {
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

  @scala.annotation.tailrec
  def fizzBuzzForRecursive(n: Int, i: Int = 1): Unit = {
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
    if (i < n) fizzBuzzForRecursive(n, i + 1)
  }
}
