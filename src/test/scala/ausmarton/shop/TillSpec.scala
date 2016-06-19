package ausmarton.shop

import org.scalatest.{Matchers, WordSpecLike}

class TillSpec extends WordSpecLike with Matchers {
  "empty cart" should {
    "cost 0" in {
      Till.checkout shouldBe 0
    }
  }
}
