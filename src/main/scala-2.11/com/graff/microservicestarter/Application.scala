package com.graff.microservicestarter

import akka.actor.ActorSystem

/**
  * Created by alexandergraff on 10/9/16.
  */
object Application extends App{
  val settings: AppSettings = new AppSettings()
  import settings._

  /* Creates the Actor System */
  val system = ActorSystem(appName)

  // Class that creates all of the portions of the Micro Service (guardian node etc)
  val microService = new MicroService(system)
}
