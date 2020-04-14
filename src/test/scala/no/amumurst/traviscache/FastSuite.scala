package no.amumurst.traviscache

class FastSuite extends munit.FunSuite with IORunner {
  test("0") { FastFunctions.sleeper(0) }
  test("1") { FastFunctions.sleeper(1) }
  test("2") { FastFunctions.sleeper(2) }
  test("3") { FastFunctions.sleeper(3) }
  test("4") { FastFunctions.sleeper(4) }
  test("5") { FastFunctions.sleeper(5) }
  test("6") { FastFunctions.sleeper(6) }
  test("7") { FastFunctions.sleeper(7) }
  test("8") { FastFunctions.sleeper(8) }
  test("9") { FastFunctions.sleeper(9) }
}
