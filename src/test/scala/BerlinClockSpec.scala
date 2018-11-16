import BerlinClock._
import org.scalatest.{MustMatchers, WordSpec}
import java.text.SimpleDateFormat
import java.util.Calendar


class BerlinClockSpec extends WordSpec with MustMatchers {

//  "Seconds Lamp Status" must {
//
//    "return false when given 0" in {
//
//      secondsLampStatus(0) mustEqual "O"
//    }
//
//    "return true when given 1" in {
//
//      secondsLampStatus(1) mustEqual "Y"
//    }
//
//    "return false when given 10" in {
//
//      secondsLampStatus(10) mustEqual "O"
//    }
//
//    "return true when given 39" in {
//
//      secondsLampStatus(39) mustEqual "Y"
//    }
//
//    "return false when given 62" in {
//
//      secondsLampStatus(62) mustEqual "O"
//    }
//  }
//
//  "Top Hour Lamps" must {
//
//    "return 'OOOO' when given 0" in {
//
//      topHourLamps(0) mustEqual "OOOO"
//
//    }
//
//    "return 'ROOO' when given 5" in {
//
//      topHourLamps(5) mustEqual "ROOO"
//
//    }
//
//    "return 'RROO' when given 10" in {
//
//      topHourLamps(10) mustEqual "RROO"
//
//    }
//
//    "return 'RRRO' when given 17" in {
//
//      topHourLamps(17) mustEqual "RRRO"
//
//    }
//
//    "return 'RRRR' when given 22" in {
//
//      topHourLamps(22) mustEqual "RRRR"
//
//    }
//  }
//
//  "Bottom Hour Lamps" must {
//
//    "return 'OOOO' when given 0" in {
//
//      bottomHourLamps(0) mustEqual "OOOO"
//
//    }
//
//    "return 'ROOO' when given 1" in {
//
//      bottomHourLamps(1) mustEqual "ROOO"
//
//    }
//
//    "return 'RROO' when given 2" in {
//
//      bottomHourLamps(2) mustEqual "RROO"
//
//    }
//
//    "return 'RRRO' when given 3" in {
//
//      bottomHourLamps(3) mustEqual "RRRO"
//
//    }
//
//    "return 'RRRR' when given 4" in {
//
//      bottomHourLamps(4) mustEqual "RRRR"
//
//    }
//  }
//
//  "Top Minute Lamps" must {
//
//    "return 'OOOOOOOOOOO' when given 0" in {
//
//      topMinuteLamps(0) mustEqual "OOOOOOOOOOO"
//
//    }
//
//    "return 'YOOOOOOOOOO' when given 5" in {
//
//      topMinuteLamps(5) mustEqual "YOOOOOOOOOO"
//
//    }
//
//    "return 'YYROOOOOOOO' when given 16" in {
//
//      topMinuteLamps(16) mustEqual "YYROOOOOOOO"
//
//    }
//
//    "return 'YYRYYRYYRYY' when given 57" in {
//
//      topMinuteLamps(57) mustEqual "YYRYYRYYRYY"
//
//    }
//  }
//
//  "Bottom Minute Lamps" must {
//
//    "return 'OOOO' when given 0" in {
//
//      bottomMinuteLamps(0) mustEqual "OOOO"
//
//    }
//
//    "return 'YOOO' when given 1" in {
//
//      bottomMinuteLamps(1) mustEqual "YOOO"
//
//    }
//
//    "return 'YYOO' when given 2" in {
//
//      bottomMinuteLamps(2) mustEqual "YYOO"
//
//    }
//
//    "return 'YYYO' when given 3" in {
//
//      bottomMinuteLamps(3) mustEqual "YYYO"
//
//    }
//
//    "return 'YYYY' when given 4" in {
//
//      bottomMinuteLamps(4) mustEqual "YYYY"
//
//    }
//  }

  "Berlin Clock Time Conversion" must {

    val date = Calendar.getInstance.getTime
    val currentHour = new SimpleDateFormat("hh").format(date).toInt
    val currentMinute = new SimpleDateFormat("mm").format(date).toInt
    val currentSecond = new SimpleDateFormat("ss").format(date).toInt

    "return 'OOOO, OOOO, OOOOOOOOOOO, OOOO, O' when given '0, 0, 0'" in {

      berlinClockTimeConversion(0, 0, 0) mustEqual BerlinClockTime(TopHours(O, O, O, O), BottomHours(O, O, O, O), TopMinutes(O, O, O, O, O, O, O, O, O, O, O),
        BottomMinutes(O, O, O, O), Seconds(O))

    }

    "return 'RROO, RRRO, YYROOOOOOOO, YOOO, Y' when given '13, 16, 3'" in {

      berlinClockTimeConversion(13, 16, 3) mustEqual BerlinClockTime(TopHours(R, R, O, O), BottomHours(R, R, R, O), TopMinutes(Y, Y, R, O, O, O, O, O, O, O, O),
        BottomMinutes(Y, O, O, O), Seconds(Y))

    }

    "return 'RRRR, RRRR, YYRYYRYYRYY, YYYY, Y' when given '23, 59, 59'" in {

      berlinClockTimeConversion(23, 59, 59) mustEqual BerlinClockTime(TopHours(R, R, R, R), BottomHours(R, R, R, O), TopMinutes(Y, Y, R, Y, Y, R, Y, Y, R, Y, Y),
        BottomMinutes(Y, Y, Y, Y), Seconds(Y))

    }

    "return correct response to current time" in {

      berlinClockTimeConversion(currentHour, currentMinute, currentSecond) mustEqual BerlinClockTime(TopHours(R, R, R, R), BottomHours(R, R, R, O), TopMinutes(Y, Y, R, Y, Y, R, Y, Y, R, Y, Y),
        BottomMinutes(Y, Y, Y, Y), Seconds(Y))

    }
  }
}
