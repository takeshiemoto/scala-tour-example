package example

trait Color {
  val red: Int
  val green: Int
  val blue: Int

  def printColor(): Unit = println(s"$red-$green-$blue")
}
