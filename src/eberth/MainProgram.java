package eberth;

import javax.xml.ws.Endpoint;

/**
 * in this class the server program starts
 */
public class MainProgram {

    /**
     * in this method the server program starts
     * @param args is not used
     */
    public static void main(String[] args) {

        OpenWeather openWeather = new OpenWeather();
        System.setProperty("javax.xml.bind.JAXBContextFactory","org.eclipse.persistence.jaxb.JAXBContextFactory");
        Endpoint endpoint = Endpoint.publish("http://localhost:8081/OpenWeather", openWeather);
        System.out.println("server up and running...");

    }
}
