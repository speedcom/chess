import org.scalatest.{FlatSpec, Matchers}
import Figure._
import Field._
import Color._
import FieldPosition._

class BoardTest extends FlatSpec with Matchers {

  "Board" should "create new game" in {
    val board = Board()

    val expectedBoard = Board(
      Array(
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
        Field(H2, Some(ColoredFigure(White, Pawn))),
        Field(A3, None),
        Field(B3, None),
        Field(C3, None),
        Field(D3, None),
        Field(E3, None),
        Field(F3, None),
        Field(G3, None),
        Field(H3, None),
        Field(A4, None),
        Field(B4, None),
        Field(C4, None),
        Field(D4, None),
        Field(E4, None),
        Field(F4, None),
        Field(G4, None),
        Field(H4, None),
        Field(A5, None),
        Field(B5, None),
        Field(C5, None),
        Field(D5, None),
        Field(E5, None),
        Field(F5, None),
        Field(G5, None),
        Field(H5, None),
        Field(A6, None),
        Field(B6, None),
        Field(C6, None),
        Field(D6, None),
        Field(E6, None),
        Field(F6, None),
        Field(G6, None),
        Field(H6, None),
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
        Field(H8, Some(ColoredFigure(Black, Rook))))
      )

    board.fields.toList should be(expectedBoard.fields.toList)
  }

}
