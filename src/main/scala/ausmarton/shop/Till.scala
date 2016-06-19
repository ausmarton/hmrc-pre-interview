package ausmarton.shop

import ausmarton.shop.inventory.{Apple, Fruit, Orange}

object Till {
  def checkout(cart: Seq[Fruit]) = {
    val (apples, oranges) = cart.partition(_ == Apple)

    apples.grouped(2).size * Apple.cost +
    oranges.grouped(3).map(_.size.min(2)).sum * Orange.cost
  }
}
