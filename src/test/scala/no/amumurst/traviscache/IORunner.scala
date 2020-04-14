package no.amumurst.traviscache

import cats.effect.{ContextShift, IO, Timer}
import munit.{FunSuite, ValueTransforms}

trait IORunner extends ValueTransforms { this: FunSuite =>
  override def munitValueTransforms: List[ValueTransform] = super.munitValueTransforms ++ List(
    new ValueTransform("IO", {
      case a: IO[_] => a.unsafeToFuture()
    })
  )
  implicit val ts: Timer[IO]        = IO.timer(munitExecutionContext)
  implicit val cs: ContextShift[IO] = IO.contextShift(munitExecutionContext)
}
