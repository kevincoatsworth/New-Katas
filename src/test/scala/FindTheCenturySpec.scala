import org.scalatest.{MustMatchers, WordSpec}

class FindTheCenturySpec extends WordSpec with MustMatchers {

  "FindTheCentury" must {

    "return 1 when given 6" in {

      FindTheCentury.returnTheCentury(6) mustEqual 1

    }

    "return 11 when given 1066" in {

      FindTheCentury.returnTheCentury(1066) mustEqual 11

    }

    "return 20 when given 2000" in {

      FindTheCentury.returnTheCentury(2000) mustEqual 20

    }
  }
}
