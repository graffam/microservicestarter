package com.graff.microservicestarter

import com.typesafe.config.{Config, ConfigFactory}
import java.net.InetAddress

import scala.util.Try

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

  val rootConfig = conf match {
    case Some(c) => c.withFallback(ConfigFactory.load())
    case _ => ConfigFactory.load
  }

  // Config for all service specific configurations (NOT SPARK ETC)
  val serviceConfig = rootConfig.getConfig("service")

  val appName = serviceConfig.getString("appName")

  /** Attempts to acquire from environment, then java system properties. */
  def withFallback[T](env: Try[T], key: String): Option[T] = env match {
    case null  => None
    case value => value.toOption
  }
}
