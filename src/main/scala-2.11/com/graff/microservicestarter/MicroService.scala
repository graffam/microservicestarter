package com.graff.microservicestarter

import akka.actor.ActorSystem

/**
  * Created by alexandergraff on 10/9/16.
  */


class MicroService(system: ActorSystem) {
  val guardian = system.actorOf(NodeGuardian.props(), "node-guardian")
}
