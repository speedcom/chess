case class ColoredFigure(color: Color, figure: Figure)
case class Field(pos: FieldPosition, f: Option[ColoredFigure])

sealed trait FieldPosition
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