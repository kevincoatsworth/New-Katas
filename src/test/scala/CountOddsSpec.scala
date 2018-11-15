import org.scalatest.{MustMatchers, WordSpec}

class CountOddsSpec extends WordSpec with MustMatchers {

  "CountOdds" must {

    "return 1 when given 2" in {

      CountOdds.countAmountOfOddNumbers(2) mustEqual 1

    }

    "return 2 when given 5" in {

      CountOdds.countAmountOfOddNumbers(5) mustEqual 2

    }

    "return 6 when given 12" in {

      CountOdds.countAmountOfOddNumbers(12) mustEqual 6

    }

    "return 56 when given 113" in {

      CountOdds.countAmountOfOddNumbers(113) mustEqual 56

    }

    "return 210 when given 420" in {

      CountOdds.countAmountOfOddNumbers(420) mustEqual 210

    }
  }
}