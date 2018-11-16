sealed trait LampStatus

case object R extends LampStatus
case object Y extends LampStatus
case object O extends LampStatus

case class BerlinClockTime(topHours: TopHours, bottomHours: BottomHours, topMinutes: TopMinutes, bottomMinutes: BottomMinutes, seconds: Seconds)
case class TopHours(lamp1: LampStatus, lamp2: LampStatus, lamp3: LampStatus, lamp4: LampStatus)
case class BottomHours(lamp1: LampStatus, lamp2: LampStatus, lamp3: LampStatus, lamp4: LampStatus)
case class TopMinutes(lamp1: LampStatus, lamp2: LampStatus, lamp3: LampStatus, lamp4: LampStatus, lamp5: LampStatus, lamp6: LampStatus,
                      lamp7: LampStatus, lamp8: LampStatus, lamp9: LampStatus, lamp10: LampStatus, lamp11: LampStatus)
case class BottomMinutes(lamp1: LampStatus, lamp2: LampStatus, lamp3: LampStatus, lamp4: LampStatus)
case class Seconds(lamp1: LampStatus)

object BerlinClock {

  def berlinClockTimeConversion(hours: Int, minutes: Int, seconds: Int): BerlinClockTime = {

    val fiveHours: TopHours = fiveHourlyLamps(hours)
    val oneHours: BottomHours = oneHourlyLamps(hours % 5)
    val fiveMinutes: TopMinutes = fiveMinuteLamps(minutes / 5)
    val oneMinutes: BottomMinutes = oneMinuteLamps(minutes % 5)
    val secondsStatus: Seconds = secondsLampStatus(seconds)

    BerlinClockTime(fiveHours, oneHours, fiveMinutes, oneMinutes, secondsStatus)

  }

  private def secondsLampStatus(numOfSeconds: Int): Seconds = {

    numOfSeconds match {

      case seconds if seconds % 2 == 0 => Seconds(O)
      case _ => Seconds(Y)

    }
  }

  private def fiveHourlyLamps(hoursFives: Int): TopHours = {

    hoursFives match {

      case hours if hours > 19 => TopHours(R, R, R, R)
      case hours if hours > 14 => TopHours(R, R, R, O)
      case hours if hours > 9 => TopHours(R, R, O, O)
      case hours if hours > 4 => TopHours(R, O, O, O)
      case _ => TopHours(O, O, O, O)

    }
  }

  private def oneHourlyLamps(hoursOnes: Int): BottomHours = {

    hoursOnes match {

      case 1 => BottomHours(R, O, O, O)
      case 2 => BottomHours(R, R, O, O)
      case 3 => BottomHours(R, R, R, O)
      case 4 => BottomHours(R, R, R, R)
      case _ => BottomHours(O, O, O, O)

    }
  }

  private def fiveMinuteLamps(minutesFives: Int): TopMinutes = {

    minutesFives match {

      case 1 => TopMinutes(Y, O, O, O, O, O, O, O, O, O, O)
      case 2 => TopMinutes(Y, Y, O, O, O, O, O, O, O, O, O)
      case 3 => TopMinutes(Y, Y, R, O, O, O, O, O, O, O, O)
      case 4 => TopMinutes(Y, Y, R, Y, O, O, O, O, O, O, O)
      case 5 => TopMinutes(Y, Y, R, Y, Y, O, O, O, O, O, O)
      case 6 => TopMinutes(Y, Y, R, Y, Y, R, O, O, O, O, O)
      case 7 => TopMinutes(Y, Y, R, Y, Y, R, Y, O, O, O, O)
      case 8 => TopMinutes(Y, Y, R, Y, Y, R, Y, Y, O, O, O)
      case 9 => TopMinutes(Y, Y, R, Y, Y, R, Y, Y, R, O, O)
      case 10 => TopMinutes(Y, Y, R, Y, Y, R, Y, Y, R, Y, O)
      case 11 => TopMinutes(Y, Y, R, Y, Y, R, Y, Y, R, Y, Y)
      case _ => TopMinutes(O, O, O, O, O, O, O, O, O, O, O)

    }
  }

  private def oneMinuteLamps(minutesOnes: Int): BottomMinutes = {

    minutesOnes match {

      case 1 => BottomMinutes(Y, O, O, O)
      case 2 => BottomMinutes(Y, Y, O, O)
      case 3 => BottomMinutes(Y, Y, Y, O)
      case 4 => BottomMinutes(Y, Y, Y, Y)
      case _ => BottomMinutes(O, O, O, O)

    }
  }
}
