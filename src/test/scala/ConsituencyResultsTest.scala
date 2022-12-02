import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.must.Matchers.contain
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper

class ConsituencyResultsTest extends AnyFunSuite {

  test("translates votes cast into percentage share") {
    val consituencyResults = ConsituencyResults("name", Map(Labour -> 50, Conservative -> 100, GreenParty -> 50))

    consituencyResults.percentageShare should contain (Conservative -> 0.5)
  }

}
