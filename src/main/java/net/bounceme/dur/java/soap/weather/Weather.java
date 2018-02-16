package net.bounceme.dur.java.soap.weather;

import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.stream.Location;
import javax.xml.ws.WebServiceClient;

public class Weather {

    private static final Logger log = Logger.getLogger(App.class.getName());

    public void interrrogateWSDL() throws MalformedURLException {
        String s = "http://www.webservicex.net/geoipservice.asmx/GetGeoIP";
        URL url = new URL(s);
        log.info(url.toString());
    }

    public void foo() {
        try (WebServiceClient client = new WebServiceClient.Builder(42, "license_key")
                .build()) {

            InetAddress ipAddress = InetAddress.getByName("128.101.101.101");

            // Do the lookup
            CityResponse response = client.city(ipAddress);

            Country country = response.getCountry();
            System.out.println(country.getIsoCode());            // 'US'
            System.out.println(country.getName());               // 'United States'
            System.out.println(country.getNames().get("zh-CN")); // '美国'

            Subdivision subdivision = response.getMostSpecificSubdivision();
            System.out.println(subdivision.getName());       // 'Minnesota'
            System.out.println(subdivision.getIsoCode());    // 'MN'

            City city = response.getCity();
            System.out.println(city.getName());       // 'Minneapolis'

            Postal postal = response.getPostal();
            System.out.println(postal.getCode());       // '55455'

            Location location = response.getLocation();
            System.out.println(location.getLatitude());        // 44.9733
            System.out.println(location.getLongitude());       // -93.2323
        }
    }

}
