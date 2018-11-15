object BerlinClock {

  def secondsLampStatus(numOfSeconds: Int): String = {

    numOfSeconds match {

      case seconds if seconds % 2 == 0 => "Y"
      case _ => "O"

    }
  }

  def topHourLamps(numOfHours: Int): String = {

    numOfHours match {

      case hours if hours > 19 => "RRRR"
      case hours if hours > 14 => "RRRO"
      case hours if hours > 9 => "RROO"
      case hours if hours > 4 => "ROOO"
      case _ => "OOOO"

    }
  }

  def bottomHourLamps(numOfHours: Int): String = {

    //val remainderHours = numOfHours % 5

    numOfHours match {

      case 1 => "ROOO"
      case 2 => "RROO"
      case 3 => "RRRO"
      case 4 => "RRRR"
      case _ => "OOOO"

    }
  }

  def topMinuteLamps(numOfMinutes: Int): String = {

    val numOfLamps = numOfMinutes / 5

    numOfLamps match {

      case 1 => "YOOOOOOOOOO"
      case 2 => "YYOOOOOOOOO"
      case 3 => "YYROOOOOOOO"
      case 4 => "YYRYOOOOOOO"
      case 5 => "YYRYYOOOOOO"
      case 6 => "YYRYYROOOOO"
      case 7 => "YYRYYRYOOOO"
      case 8 => "YYRYYRYYOOO"
      case 9 => "YYRYYRYYROO"
      case 10 => "YYRYYRYYRYO"
      case 11 => "YYRYYRYYRYY"
      case _ => "OOOOOOOOOOO"

    }
  }

  def bottomMinuteLamps(numOfMinutes: Int): String = {

    numOfMinutes match {

      case 1 => "YOOO"
      case 2 => "YYOO"
      case 3 => "YYYO"
      case 4 => "YYYY"
      case _ => "OOOO"

    }
  }
}
