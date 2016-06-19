package ausmarton.shop

import ausmarton.shop.inventory.Apple

object Till {
  def checkout(cart: Seq[Apple.type]) = cart.length * 60
}
