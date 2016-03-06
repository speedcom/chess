sealed trait BoardPresenter
object BoardPresenter {

  object ConsolePresenter extends BoardPresenter {

    def figureNameSymbol(f: Figure): String = f match {
      case Figure.Pawn   => "P"
      case Figure.Rook   => "R"
      case Figure.Knight => "S"
      case Figure.Bishop => "B"
      case Figure.Queen  => "Q"
      case Figure.King   => "K"
    }
    def colorNameSymbol(c: Color): String = c match {
      case Color.White => "w"
      case Color.Black => "b"
    }

    def apply(board: Board): String = {

      def mkString(row: Array[Field]): String = {
        row
          .map(_.f.map(cf => figureNameSymbol(cf.figure) + colorNameSymbol(cf.color)).getOrElse("  "))
          .mkString("| ", " | ", " |")
      }

      "8 " + mkString(board._8_row) + "\n" +
      "7 " + mkString(board._7_row) + "\n" +
      "6 " + mkString(board._6_row) + "\n" +
      "5 " + mkString(board._5_row) + "\n" +
      "4 " + mkString(board._4_row) + "\n" +
      "3 " + mkString(board._3_row) + "\n" +
      "2 " + mkString(board._2_row) + "\n" +
      "1 " + mkString(board._1_row) + "\n" +
      "  " + List(" A"," B"," C"," D"," E"," F"," G"," H").mkString("| ", " | ", " |")
    }
  }
}
