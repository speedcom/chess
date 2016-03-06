sealed trait Figure
object Figure {
  case object Pawn   extends Figure
  case object Rook   extends Figure
  case object Knight extends Figure
  case object Bishop extends Figure
  case object Queen  extends Figure
  case object King  extends Figure
}
