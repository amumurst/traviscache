package no.amumurst.traviscache
import cats.implicits._
import cats.effect.{IO, Timer}
import scala.concurrent.duration._

object SlowFunctions {
  def sleeper(i: Int)(implicit t: Timer[IO]): IO[Unit] =
    IO(println(s"Running slow function $i")) *> IO
      .sleep(i.seconds)
}
