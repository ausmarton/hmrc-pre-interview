package ausmarton.shop.inventory

sealed trait Fruit {
  def cost: Int
}

object Apple extends Fruit {
  override def cost: Int = 60
}
object Orange extends Fruit {
  override def cost: Int = 25
}

