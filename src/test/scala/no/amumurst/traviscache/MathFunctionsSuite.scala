package no.amumurst.traviscache

import MathFunctions._

class MathFunctionsSuite extends munit.FunSuite {
  test("one") { assertEquals(times2(2), 4) }
  test("two") { assertEquals(times2(8), 16) }
}
