package com.graff.microservicestarter

/**
  * Created by alexandergraff on 10/13/16.
  */
object NodeGuardianMessages {
  // Using a Sealed trait ensures behavior for each case class must be defined
  sealed trait NodeGuardianMessage

  // Echo a message sent to it (very useful for testing)
  case class Echo(msg: String) extends NodeGuardianMessage
}
