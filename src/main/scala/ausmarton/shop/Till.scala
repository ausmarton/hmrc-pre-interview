package ausmarton.shop

import ausmarton.shop.inventory.Fruit

object Till {
  def checkout(cart: Seq[Fruit]) = cart.map(_.cost).sum
}
