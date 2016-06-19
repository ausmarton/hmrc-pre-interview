package ausmarton.shop

import ausmarton.shop.inventory.{Apple, Orange}
import org.scalatest.{Matchers, WordSpecLike}

class TillSpec extends WordSpecLike with Matchers {
  //Step 1: Shopping cart
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

  "1 orange" should {
    "cost 25p" in {
      Till.checkout(Seq(Orange)) shouldBe 25
    }
  }

  "1 apple and 2 oranges" should {
    "cost 110p (£1.1)" in {
      Till.checkout(Seq(Apple, Orange, Orange)) shouldBe 110
    }
  }

  //Step 2: Simple offers
  "2 apples" should {
    "cost 60p" in {
      Till.checkout(Seq(Apple, Apple)) shouldBe 60
    }
  }

  "2 oranges" should {
    "cost 50p" in {
      Till.checkout(Seq(Orange, Orange)) shouldBe 50
    }
  }

  "3 oranges" should {
    "cost 50p" in {
      Till.checkout(Seq(Orange, Orange, Orange)) shouldBe 50
    }
  }

  "3 apples and 2 oranges" should {
    "cost 170p (£1.7)" in {
      Till.checkout(Seq(Apple, Orange, Orange, Apple, Apple)) shouldBe 170
    }
  }

  "4 apples and 5 oranges" should {
    "cost 220p (£2.2)" in {
      Till.checkout(Seq(Apple, Apple, Apple, Apple,
        Orange, Orange, Orange, Orange, Orange)) shouldBe 220
    }
  }
}
