package no.amumurst.traviscache

class SlowSuite extends munit.FunSuite with IORunner {
  test("0") { SlowFunctions.sleeper(0) }
  test("1") { SlowFunctions.sleeper(1) }
  test("2") { SlowFunctions.sleeper(2) }
  test("3") { SlowFunctions.sleeper(3) }
  test("4") { SlowFunctions.sleeper(4) }
  test("5") { SlowFunctions.sleeper(5) }
  test("6") { SlowFunctions.sleeper(6) }
  test("7") { SlowFunctions.sleeper(7) }
  test("8") { SlowFunctions.sleeper(8) }
  test("9") { SlowFunctions.sleeper(9) }
}
