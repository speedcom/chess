final case class PositionChange(from: FieldPosition, to: FieldPosition)

object MoveCommandParser {

  object FieldPositionParser {

    private val SPLITTER  = ':'

    def apply(command: String): Option[PositionChange] = {
      command.split(SPLITTER).map(_.trim).toList match {
        case from :: to :: Nil if from != to =>
          for {
            f <- FieldExtractor.string2positionOpt(from)
            t <- FieldExtractor.string2positionOpt(to)
          } yield PositionChange(f, t)
        case _ => None
      }
    }
  }

}
