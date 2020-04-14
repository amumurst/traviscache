package no.amumurst.traviscache
import MathFunctions._

class MathFunctionScalatest extends org.scalatest.funsuite.AnyFunSuite {
  test("one") { assert(times2(2) == 4) }
  test("two") { assert(times2(8) == 16) }
}
