package example

class Triangle(edges: List[Int]) extends Polygon(edges) {
  val a: Int = edges.head
  val b: Int = edges(1)
  val c: Int = edges(2)

  val area: Double = {
    val s = (a + b + c) / 2.0
    math.sqrt(s * (s - a) * (s - b) * (s - c))
  }
}
