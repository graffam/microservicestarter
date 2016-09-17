package TestHelpers

import org.scalatest._

/**
  * Created by alexandergraff on 9/17/16.
  */
abstract class UnitSpec extends FlatSpec with Matchers with
  OptionValues  with Inside with Inspectors {

}
