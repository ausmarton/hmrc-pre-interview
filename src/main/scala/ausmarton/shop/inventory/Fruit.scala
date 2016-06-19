package ausmarton.shop.inventory

sealed trait Fruit {
  def cost: Int
}

object Apple extends Fruit {
  override def cost = 60
}
object Orange extends Fruit {
  override def cost = 25
}

