package ausmarton.shop

import ausmarton.shop.inventory.Apple
import org.scalatest.{Matchers, WordSpecLike}

class TillSpec extends WordSpecLike with Matchers {
  "empty cart" should {
    "cost 0" in {
      Till.checkout(Nil) shouldBe 0
    }
  }

  "1 apple" should {
    "cost 60p" in {
      Till.checkout(Seq(Apple)) shouldBe 60
    }
  }
}
