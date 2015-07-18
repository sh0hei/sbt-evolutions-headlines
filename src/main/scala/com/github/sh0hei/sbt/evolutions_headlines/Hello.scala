import sbt._
import keys._

object HelloPlugin extends Plugin {
  override lazy val settings = Seq(
    commands ++= Seq(
      hello
    )
  )

  // Define command
  lazy val hello = Command.command("Hello") { state =>
    println("Hello, sbt Plugin")
    state
  }
}
