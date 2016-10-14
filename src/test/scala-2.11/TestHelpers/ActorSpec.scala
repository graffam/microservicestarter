package TestHelpers

import akka.actor.ActorSystem
import akka.testkit.TestKit
import org.scalatest.{Matchers, WordSpecLike}

/**
  * Base Akka Actor class used for testing internal behavior of actors
  */
abstract class ActorSpec extends TestKit(ActorSystem("TestSystem"))
  with WordSpecLike
  with Matchers
  with StopSystemAfterAll{

  }
