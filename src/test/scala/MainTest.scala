import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper

class MainTest extends AnyFunSuite {
  test("can run a test") {
    1 + 1 shouldBe 2
  }
}
