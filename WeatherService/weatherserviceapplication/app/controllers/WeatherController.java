package controllers;

import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;

public class WeatherController extends Controller {

    public Result getWeather(){
        //las vegas woeid: 2436704
        return ok("weather");
    }

}
