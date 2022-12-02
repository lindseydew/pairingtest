import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper

class ParseResultsTest extends AnyFunSuite {


  test("can parse a single line of the election results") {
    val line = "Cardiff West, 11014, C, 17803, L, 4923, UKIP, 2069, LD"

    ParseResults.parseLine(line) shouldBe Right(ConsituencyResults("Cardiff West", Map(Conservative -> 11014, Labour -> 17803, UKIP -> 4923, LiberalDemocrats -> 2069)))
  }
}
