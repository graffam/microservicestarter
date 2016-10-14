import TestHelpers.ActorSpec
import akka.actor.Props
import akka.testkit.{ImplicitSender, TestActorRef, TestActors, TestProbe}
import com.graff.microservicestarter.NodeGuardian

/**
  * Created by alexandergraff on 10/13/16.
  */
class NodeGuardianSpec extends ActorSpec with ImplicitSender{
  import com.graff.microservicestarter.NodeGuardianMessages._
  "A Node Guardian" must {
    "Echo an Echo message" in {
      val guardian = system.actorOf(NodeGuardian.props())
      guardian ! Echo("Test")
      expectMsg(Echo("Test"))
    }
  }
}
