package no.amumurst.traviscache

import MathFunctions._

class MathFunctionsSuite extends munit.FunSuite {
  test("one") { assertEquals(supermath(2), 4) }
  test("two") { assertEquals(supermath(8), 16) }
}
