import org.scalatest.{MustMatchers, WordSpec}

class NumberToLCDSpec extends WordSpec with MustMatchers {

  "NumberToLCD" must {

    "return an LCD style digit when provided with a single int" in {

      NumberToLCD.converterAndOutput(1) mustEqual List(One)
    }

    "return an LCD style digit when provided with a two digit int" in {

      NumberToLCD.converterAndOutput(15) mustEqual List(One, Five)
    }

    "return an LCD style digit when provided with a four (1076) digit int" in {

      NumberToLCD.converterAndOutput(1076) mustEqual List(One, Zero, Seven, Six)
    }

    "return an LCD style digit when provided with a ten digit int" in {

      NumberToLCD.converterAndOutput(1432563076) mustEqual List(One, Four, Three, Two, Five, Six, Three, Zero, Seven, Six)
    }
  }
}
