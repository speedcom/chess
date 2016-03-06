import org.scalatest.{FlatSpec, Matchers}

class BoardPresenterTest extends FlatSpec with Matchers {

  "ConsolePresenter" should "be able to create plain text version of board" in {
      val board = Board()

    val presentation = BoardPresenter.ConsolePresenter(board)

    val expectedPresentation =
    """8 | Rb | Sb | Bb | Qb | Kb | Bb | Sb | Rb |
7 | Pb | Pb | Pb | Pb | Pb | Pb | Pb | Pb |
6 |    |    |    |    |    |    |    |    |
5 |    |    |    |    |    |    |    |    |
4 |    |    |    |    |    |    |    |    |
3 |    |    |    |    |    |    |    |    |
2 | Pw | Pw | Pw | Pw | Pw | Pw | Pw | Pw |
1 | Rw | Sw | Bw | Qw | Kw | Bw | Sw | Rw |
  |  A |  B |  C |  D |  E |  F |  G |  H |"""

    presentation should be(expectedPresentation)
  }

}
