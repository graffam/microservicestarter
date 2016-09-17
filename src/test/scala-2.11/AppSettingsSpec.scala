import TestHelpers.{TestFileHelper, UnitSpec}
import org.scalatest._

/**
  * Created by alexandergraff on 9/17/16.
  */
class AppSettingsSpec extends UnitSpec with TestFileHelper{
  behavior of "AppSettings Class"

  val settings = new AppSettings()
  import settings._

  it should "get the expected configurations" in {
    assert(localAddress != null)
  }
}
