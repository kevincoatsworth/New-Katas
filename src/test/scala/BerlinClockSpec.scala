import BerlinClock._
import org.scalatest.{MustMatchers, WordSpec}


class BerlinClockSpec extends WordSpec with MustMatchers {

  "Seconds Lamp Status" must {

    "return false when given 0" in {

      secondsLampStatus(0) mustEqual "Y"
    }

    "return true when given 1" in {

      secondsLampStatus(1) mustEqual "O"
    }

    "return false when given 10" in {

      secondsLampStatus(10) mustEqual "Y"
    }

    "return true when given 39" in {

      secondsLampStatus(39) mustEqual "O"
    }

    "return false when given 62" in {

      secondsLampStatus(62) mustEqual "Y"
    }
  }

  "Top Hour Lamps" must {

    "return 'OOOO' when given 0" in {

      topHourLamps(0) mustEqual "OOOO"

    }

    "return 'ROOO' when given 5" in {

      topHourLamps(5) mustEqual "ROOO"

    }

    "return 'RROO' when given 10" in {

      topHourLamps(10) mustEqual "RROO"

    }

    "return 'RRRO' when given 17" in {

      topHourLamps(17) mustEqual "RRRO"

    }

    "return 'RRRR' when given 22" in {

      topHourLamps(22) mustEqual "RRRR"

    }
  }

  "Bottom Hour Lamps" must {

    "return 'OOOO' when given 0" in {

      bottomHourLamps(0) mustEqual "OOOO"

    }

    "return 'ROOO' when given 1" in {

      bottomHourLamps(1) mustEqual "ROOO"

    }

    "return 'RROO' when given 2" in {

      bottomHourLamps(2) mustEqual "RROO"

    }

    "return 'RRRO' when given 3" in {

      bottomHourLamps(3) mustEqual "RRRO"

    }

    "return 'RRRR' when given 4" in {

      bottomHourLamps(4) mustEqual "RRRR"

    }
  }

  "Top Minute Lamps" must {

    "return 'OOOOOOOOOOO' when given 0" in {

      topMinuteLamps(0) mustEqual "OOOOOOOOOOO"

    }

    "return 'YOOOOOOOOOO' when given 5" in {

      topMinuteLamps(5) mustEqual "YOOOOOOOOOO"

    }

    "return 'YYROOOOOOOO' when given 16" in {

      topMinuteLamps(16) mustEqual "YYROOOOOOOO"

    }

    "return 'YYRYYRYYRYY' when given 57" in {

      topMinuteLamps(57) mustEqual "YYRYYRYYRYY"

    }
  }

  "Bottom Minute Lamps" must {

    "return 'OOOO' when given 0" in {

      bottomMinuteLamps(0) mustEqual "OOOO"

    }

    "return 'YOOO' when given 1" in {

      bottomMinuteLamps(1) mustEqual "YOOO"

    }

    "return 'YYOO' when given 2" in {

      bottomMinuteLamps(2) mustEqual "YYOO"

    }

    "return 'YYYO' when given 3" in {

      bottomMinuteLamps(3) mustEqual "YYYO"

    }

    "return 'YYYY' when given 4" in {

      bottomMinuteLamps(4) mustEqual "YYYY"

    }
  }
}
