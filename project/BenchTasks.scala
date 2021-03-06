package org.enso.build

import sbt.{inputKey, taskKey, Tags}

/** Defines benchmarking related task keys.
  */
object BenchTasks {
  lazy val Exclusive = Tags.Tag("Exclusive")
  lazy val bench     = taskKey[Unit]("Run Benchmarks")
  lazy val benchOnly = inputKey[Unit]("Run benchmarks by name substring")
}
