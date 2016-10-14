package TestHelpers

import akka.testkit.TestKit
import org.scalatest.{BeforeAndAfterAll, Suite}

/**
  * Test trait to stop actor system after each test
  */
trait StopSystemAfterAll extends BeforeAndAfterAll{
  this: TestKit with Suite =>
    override protected def afterAll(): Unit ={
      super.afterAll()
      system.terminate()
    }
}
