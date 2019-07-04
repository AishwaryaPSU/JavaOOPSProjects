// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/aishwaryagm/JavaProjects/WeatherService/weatherserviceapplication/conf/routes
// @DATE:Sun Jun 02 10:11:49 CDT 2019

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseWeatherController WeatherController = new controllers.ReverseWeatherController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseWeatherController WeatherController = new controllers.javascript.ReverseWeatherController(RoutesPrefix.byNamePrefix());
  }

}
