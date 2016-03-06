import Figure._
import Field._
import Color._
import FieldPosition._

case class Board(fields: Array[Field]) {

  def getByFieldPosition(fp: FieldPosition): Option[Field] = {
    fields.find(_.pos == fp)
  }

  lazy val _1_row = fields.slice(0,8)
  lazy val _2_row = fields.slice(8,16)
  lazy val _3_row = fields.slice(16,24)
  lazy val _4_row = fields.slice(24,32)
  lazy val _5_row = fields.slice(32,40)
  lazy val _6_row = fields.slice(40,48)
  lazy val _7_row = fields.slice(48,56)
  lazy val _8_row = fields.slice(56,64)
}

object Board {

  def apply(): Board = {
    val whiteFigures = Array(
      Field(A1, Some(ColoredFigure(White, Rook))),
      Field(B1, Some(ColoredFigure(White, Knight))),
      Field(C1, Some(ColoredFigure(White, Bishop))),
      Field(D1, Some(ColoredFigure(White, Queen))),
      Field(E1, Some(ColoredFigure(White, King))),
      Field(F1, Some(ColoredFigure(White, Bishop))),
      Field(G1, Some(ColoredFigure(White, Knight))),
      Field(H1, Some(ColoredFigure(White, Rook))),
      Field(A2, Some(ColoredFigure(White, Pawn))),
      Field(B2, Some(ColoredFigure(White, Pawn))),
      Field(C2, Some(ColoredFigure(White, Pawn))),
      Field(D2, Some(ColoredFigure(White, Pawn))),
      Field(E2, Some(ColoredFigure(White, Pawn))),
      Field(F2, Some(ColoredFigure(White, Pawn))),
      Field(G2, Some(ColoredFigure(White, Pawn))),
      Field(H2, Some(ColoredFigure(White, Pawn)))
    )
    val noFigures = Array(
      Field(A3, None), Field(B3, None), Field(C3, None), Field(D3, None), Field(E3, None), Field(F3, None), Field(G3, None), Field(H3, None),
      Field(A4, None), Field(B4, None), Field(C4, None), Field(D4, None), Field(E4, None), Field(F4, None), Field(G4, None), Field(H4, None),
      Field(A5, None), Field(B5, None), Field(C5, None), Field(D5, None), Field(E5, None), Field(F5, None), Field(G5, None), Field(H5, None),
      Field(A6, None), Field(B6, None), Field(C6, None), Field(D6, None), Field(E6, None), Field(F6, None), Field(G6, None), Field(H6, None)
    )
    val blackFigures = Array(
      Field(A7, Some(ColoredFigure(Black, Pawn))),
      Field(B7, Some(ColoredFigure(Black, Pawn))),
      Field(C7, Some(ColoredFigure(Black, Pawn))),
      Field(D7, Some(ColoredFigure(Black, Pawn))),
      Field(E7, Some(ColoredFigure(Black, Pawn))),
      Field(F7, Some(ColoredFigure(Black, Pawn))),
      Field(G7, Some(ColoredFigure(Black, Pawn))),
      Field(H7, Some(ColoredFigure(Black, Pawn))),
      Field(A8, Some(ColoredFigure(Black, Rook))),
      Field(B8, Some(ColoredFigure(Black, Knight))),
      Field(C8, Some(ColoredFigure(Black, Bishop))),
      Field(D8, Some(ColoredFigure(Black, Queen))),
      Field(E8, Some(ColoredFigure(Black, King))),
      Field(F8, Some(ColoredFigure(Black, Bishop))),
      Field(G8, Some(ColoredFigure(Black, Knight))),
      Field(H8, Some(ColoredFigure(Black, Rook)))
    )

    Board(whiteFigures ++ noFigures ++ blackFigures)
  }
}