package com.graff.microservicestarter

import akka.actor.{Actor, ActorLogging, Props}

object NodeGuardian {
  /**
    * Create Props for NodeGuardian
    */
  def props(): Props = Props(new NodeGuardian)
}
class NodeGuardian extends Actor with ActorLogging {
  // The messages a NodeGuardian can receive
  import NodeGuardianMessages._


  def receive = {
    case message: NodeGuardianMessage => message match {
      case echo: Echo => sender ! Echo(echo.msg)
    }
  }
}
