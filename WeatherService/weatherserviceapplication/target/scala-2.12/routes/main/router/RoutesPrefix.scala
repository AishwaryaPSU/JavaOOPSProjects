// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/aishwaryagm/JavaProjects/WeatherService/weatherserviceapplication/conf/routes
// @DATE:Sun Jun 02 10:11:49 CDT 2019


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
