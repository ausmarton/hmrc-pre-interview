package ausmarton.shop

import ausmarton.shop.inventory.{Apple, Orange}
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

  "2 apples" should {
    "cost 120p (£1.2)" in {
      Till.checkout(Seq(Apple, Apple)) shouldBe 120
    }
  }

  "1 orange" should {
    "cost 25p" in {
      Till.checkout(Seq(Orange)) shouldBe 25
    }
  }
}
