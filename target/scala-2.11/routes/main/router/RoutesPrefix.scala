
// @GENERATOR:play-routes-compiler
// @SOURCE:/Volumes/Development/Projects/phonebook/conf/routes
// @DATE:Wed Oct 14 15:54:12 PHT 2015


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
