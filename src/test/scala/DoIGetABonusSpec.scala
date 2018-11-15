import org.scalatest.{MustMatchers, WordSpec}

class DoIGetABonusSpec extends WordSpec with MustMatchers {

  "DoIGetABonus" must {

    "return 100 when given 100 and false" in {

      DoIGetABonus.bonusCalculator(100, false) mustEqual "£100"
    }

    "return 120 when given 100 and true" in {

      DoIGetABonus.bonusCalculator(100, true) mustEqual "£120"
    }

    "return 118 when given 99 and true" in {

      DoIGetABonus.bonusCalculator(99, true) mustEqual "£118"
    }
  }
}
