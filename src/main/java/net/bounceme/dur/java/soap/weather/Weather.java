package net.bounceme.dur.java.soap.weather;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import net.webservicex.GetCitiesByCountry;
import net.webservicex.GetWeather;
import net.webservicex.GetWeatherResponse;

public class Weather {

    private static final Logger log = Logger.getLogger(App.class.getName());

    public void interrrogateWSDL() throws MalformedURLException {
        String s = "http://www.webservicex.net/geoipservice.asmx/GetGeoIP";
        URL url = new URL(s);
        log.info(url.toString());
    }

    public void getWeather(String country, String city) {
        log.info("getting weather");

        GetCitiesByCountry g = new GetCitiesByCountry();

        g.setCountryName(country);

        log.fine(g.getCountryName());

        GetWeather getWeather = new GetWeather();

        getWeather.setCountryName(country);
        getWeather.setCityName(city);

        log.fine(getWeather.getCountryName());
        log.fine(getWeather.getCityName());
        log.info(getWeather.toString());

        GetWeatherResponse weatherResponse = new GetWeatherResponse();

        log.info("weather response result:\t" + weatherResponse.getGetWeatherResult());

        log.info("end");
    }

}
