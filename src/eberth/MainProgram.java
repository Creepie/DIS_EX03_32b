package eberth;

import javax.xml.ws.Endpoint;

public class MainProgram {

    public static void main(String[] args) {

        OpenWeather test = new OpenWeather();
        System.setProperty("javax.xml.bind.JAXBContextFactory","org.eclipse.persistence.jaxb.JAXBContextFactory");
        Endpoint endpoint = Endpoint.publish("http://localhost:8081/OpenWeather", test);
        System.out.println("server up and running...");

    }
}
