package net.bounceme.dur.java.soap.weather;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;

public class Weather {

    private static final Logger log = Logger.getLogger(App.class.getName());

    public void interrrogateWSDL() throws MalformedURLException {
        String s = "http://www.webservicex.net/geoipservice.asmx/GetGeoIP";
        URL url = new URL(s);
        log.info(url.toString());
    }

    public void foo() {
        log.info("whassup");
    }

}
