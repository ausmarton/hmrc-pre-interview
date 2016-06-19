package ausmarton.shop

import ausmarton.shop.inventory.{Apple, Fruit, Orange}

object Till {
  def checkout(cart: Seq[Fruit]) = {
    val (apples, oranges) = cart.partition(_ == Apple)
    apples.grouped(2).size * Apple.cost +
    oranges.grouped(3).map(_.size match {
      case 2|3 => Orange.cost * 2
      case n => Orange.cost * n
    }).sum
  }
}
