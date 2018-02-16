package net.bounceme.dur.java.soap.weather;

import java.net.MalformedURLException;
import java.util.logging.Logger;

public class App {

    private static final Logger log = Logger.getLogger(App.class.getName());

    public static void main(String[] args) throws MalformedURLException {
        new App().run();
    }

    private void run() throws MalformedURLException {
        log.info("begin");
        Weather w = new Weather();
        w.interrrogateWSDL();
    }
}
