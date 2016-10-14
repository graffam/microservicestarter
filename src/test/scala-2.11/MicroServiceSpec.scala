import TestHelpers.ActorSpec
import akka.testkit.ImplicitSender
import com.graff.microservicestarter.MicroService
import com.graff.microservicestarter.NodeGuardianMessages.Echo

/**
  * Created by alexandergraff on 10/13/16.
  */
class MicroServiceSpec extends ActorSpec with ImplicitSender {
  "The MicroService class" must {
    "Create the Node Guardian" in {
      val microservice = new MicroService(system)
      microservice.guardian ! Echo("Test")
      expectMsg(Echo("Test"))
    }
  }
}
