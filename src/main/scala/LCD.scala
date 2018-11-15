sealed trait LCD {
  val lineOne: String
  val lineTwo: String
  val lineThree: String
}

case object One extends LCD {
  val lineOne: String =   "   "
  val lineTwo: String =   "  |"
  val lineThree: String = "  |"
}

case object Two extends LCD {
  val lineOne: String =   " _ "
  val lineTwo: String =   " _|"
  val lineThree: String = "|_ "
}

case object Three extends LCD {
  val lineOne: String =   " _ "
  val lineTwo: String =   " _|"
  val lineThree: String = " _|"
}

case object Four extends LCD {
  val lineOne: String =   "   "
  val lineTwo: String =   "|_|"
  val lineThree: String = "  |"
}

case object Five extends LCD {
  val lineOne: String =   " _ "
  val lineTwo: String =   "|_ "
  val lineThree: String = " _|"
}

case object Six extends LCD {
  val lineOne: String =   " _ "
  val lineTwo: String =   "|_ "
  val lineThree: String = "|_|"
}

case object Seven extends LCD {
  val lineOne: String =   " _ "
  val lineTwo: String =   "  |"
  val lineThree: String = "  |"
}

case object Eight extends LCD {
  val lineOne: String =   " _ "
  val lineTwo: String =   "|_|"
  val lineThree: String = "|_|"
}

case object Nine extends LCD {
  val lineOne: String =   " _ "
  val lineTwo: String =   "|_|"
  val lineThree: String = " _|"
}

case object Zero extends LCD {
  val lineOne: String =   " _ "
  val lineTwo: String =   "| |"
  val lineThree: String = "|_|"
}
