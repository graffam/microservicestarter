package com.graff.microservicestarter

import com.typesafe.config.Config
import java.net.InetAddress

/**
  * Application settings, first gets settings from the deployment environment
  * then tries the java system properties, then the default config
  *
  * Setting from command line using -D override settings in the deploy environment
  *
  * Settings can be overwritten in your own application.conf
  *
  * @param conf Optional config for tests
  */
final class AppSettings(conf: Option[Config] = None) {

  val localAddress = InetAddress.getLocalHost.getHostAddress

}
