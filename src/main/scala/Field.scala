case class ColoredFigure(color: Color, figure: Figure)
case class Field(pos: FieldPosition, f: Option[ColoredFigure])

sealed trait FieldPosition {
  def unapply(pos: String): Option[FieldPosition] = if(this.toString == pos) Some(this) else None
}
object FieldPosition {
  case object A1 extends FieldPosition
  case object A2 extends FieldPosition
  case object A3 extends FieldPosition
  case object A4 extends FieldPosition
  case object A5 extends FieldPosition
  case object A6 extends FieldPosition
  case object A7 extends FieldPosition
  case object A8 extends FieldPosition

  case object B1 extends FieldPosition
  case object B2 extends FieldPosition
  case object B3 extends FieldPosition
  case object B4 extends FieldPosition
  case object B5 extends FieldPosition
  case object B6 extends FieldPosition
  case object B7 extends FieldPosition
  case object B8 extends FieldPosition

  case object C1 extends FieldPosition
  case object C2 extends FieldPosition
  case object C3 extends FieldPosition
  case object C4 extends FieldPosition
  case object C5 extends FieldPosition
  case object C6 extends FieldPosition
  case object C7 extends FieldPosition
  case object C8 extends FieldPosition

  case object D1 extends FieldPosition
  case object D2 extends FieldPosition
  case object D3 extends FieldPosition
  case object D4 extends FieldPosition
  case object D5 extends FieldPosition
  case object D6 extends FieldPosition
  case object D7 extends FieldPosition
  case object D8 extends FieldPosition

  case object E1 extends FieldPosition
  case object E2 extends FieldPosition
  case object E3 extends FieldPosition
  case object E4 extends FieldPosition
  case object E5 extends FieldPosition
  case object E6 extends FieldPosition
  case object E7 extends FieldPosition
  case object E8 extends FieldPosition

  case object F1 extends FieldPosition
  case object F2 extends FieldPosition
  case object F3 extends FieldPosition
  case object F4 extends FieldPosition
  case object F5 extends FieldPosition
  case object F6 extends FieldPosition
  case object F7 extends FieldPosition
  case object F8 extends FieldPosition

  case object G1 extends FieldPosition
  case object G2 extends FieldPosition
  case object G3 extends FieldPosition
  case object G4 extends FieldPosition
  case object G5 extends FieldPosition
  case object G6 extends FieldPosition
  case object G7 extends FieldPosition
  case object G8 extends FieldPosition

  case object H1 extends FieldPosition
  case object H2 extends FieldPosition
  case object H3 extends FieldPosition
  case object H4 extends FieldPosition
  case object H5 extends FieldPosition
  case object H6 extends FieldPosition
  case object H7 extends FieldPosition
  case object H8 extends FieldPosition
}
object FieldExtractor {
  import FieldPosition._

  def string2positionOpt(positionString: String): Option[FieldPosition] = positionString match {
    case A1(pos) => Some(A1)
    case A2(pos) => Some(A2)
    case A3(pos) => Some(A3)
    case A4(pos) => Some(A4)
    case A5(pos) => Some(A5)
    case A6(pos) => Some(A6)
    case A7(pos) => Some(A7)
    case A8(pos) => Some(A8)
    case B1(pos) => Some(B1)
    case B2(pos) => Some(B2)
    case B3(pos) => Some(B3)
    case B4(pos) => Some(B4)
    case B5(pos) => Some(B5)
    case B6(pos) => Some(B6)
    case B7(pos) => Some(B7)
    case B8(pos) => Some(B8)
    case C1(pos) => Some(C1)
    case C2(pos) => Some(C2)
    case C3(pos) => Some(C3)
    case C4(pos) => Some(C4)
    case C5(pos) => Some(C5)
    case C6(pos) => Some(C6)
    case C7(pos) => Some(C7)
    case C8(pos) => Some(C8)
    case D1(pos) => Some(D1)
    case D2(pos) => Some(D2)
    case D3(pos) => Some(D3)
    case D4(pos) => Some(D4)
    case D5(pos) => Some(D5)
    case D6(pos) => Some(D6)
    case D7(pos) => Some(D7)
    case D8(pos) => Some(D8)
    case E1(pos) => Some(E1)
    case E2(pos) => Some(E2)
    case E3(pos) => Some(E3)
    case E4(pos) => Some(E4)
    case E5(pos) => Some(E5)
    case E6(pos) => Some(E6)
    case E7(pos) => Some(E7)
    case E8(pos) => Some(E8)
    case F1(pos) => Some(F1)
    case F2(pos) => Some(F2)
    case F3(pos) => Some(F3)
    case F4(pos) => Some(F4)
    case F5(pos) => Some(F5)
    case F6(pos) => Some(F6)
    case F7(pos) => Some(F7)
    case F8(pos) => Some(F8)
    case G1(pos) => Some(G1)
    case G2(pos) => Some(G2)
    case G3(pos) => Some(G3)
    case G4(pos) => Some(G4)
    case G5(pos) => Some(G5)
    case G6(pos) => Some(G6)
    case G7(pos) => Some(G7)
    case G8(pos) => Some(G8)
    case H1(pos) => Some(H1)
    case H2(pos) => Some(H2)
    case H3(pos) => Some(H3)
    case H4(pos) => Some(H4)
    case H5(pos) => Some(H5)
    case H6(pos) => Some(H6)
    case H7(pos) => Some(H7)
    case H8(pos) => Some(H8)
    case _ => None
  }
}
