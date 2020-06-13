package example

sealed abstract class Animal(val cry: String) {

  object Cat extends Animal("にゃー")

  object Dog extends Animal("わんわｎ")

  def checkAnimal(animal: Animal): Unit =
    animal match {
      case Cat =>
        println(s"Catです. 「${animal.cry}」と鳴きます")
      case Dog =>
        println(s"Dogです. 「${animal.cry}」と鳴きます")
    }

  val cat = Cat
  checkAnimal(cat)
}

