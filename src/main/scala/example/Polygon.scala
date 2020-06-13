package example

abstract class Polygon(edges: List[Int]) {
  val n = edges.length // n角形
  val area: Double
}

object Polygon {
  def fromEdges(edges: List[Int]):Polygon = {
    edges.length match {
      case 3 =>
        new Triangle(edges)
      case x =>
        ??? // 該当なし
    }
  }
}
