
// @GENERATOR:play-routes-compiler
// @SOURCE:/Volumes/Development/Projects/phonebook/conf/routes
// @DATE:Fri Oct 16 17:15:12 PHT 2015


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
