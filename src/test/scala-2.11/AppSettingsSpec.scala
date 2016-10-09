import TestHelpers.UnitSpec
import com.graff.microservicestarter.AppSettings
import org.scalatest._

/**
  * Created by alexandergraff on 9/17/16.
  */
class AppSettingsSpec extends UnitSpec {
  behavior of "AppSettings Class"

  val settings = new AppSettings()
  import settings._

  it should "get the expected configurations" in {
    assert(localAddress != null)
    assert(appName === "microservice")
  }
}
