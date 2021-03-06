package eberth;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;
import java.io.IOException;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import javax.xml.bind.JAXBException;

import org.eclipse.persistence.jaxb.JAXBContextProperties;
import org.eclipse.persistence.jaxb.UnmarshallerProperties;
import org.eclipse.persistence.oxm.MediaType;

/**
 * this class implement all needed Methods for the User Requests
 */
@WebService(endpointInterface = "eberth.EnvironmentData")
public class OpenWeather implements EnvironmentData {

    /**
     * this method is to test the connection
     * @return an test String
     */
    @Override
    @WebMethod
    public String saySomething(){
        return "Hello World";
    }

    /**
     * this method is to get some supported city´s
     * @return a String Array with supported city´s in it
     */
    @Override
    public String[] requestEnvironmentDataTypes() {
        String[] locations = {"Wien","Linz"};
        return locations;
    }

    /**
     * this method return a specific EnvData of the given city
     * @param _location is the city input of the client
     * @return the EnvData of the input location
     */
    @Override
    public EnvData getData(String _location) {
        String content = "";

        try {
            URL url = new URL("http://api.openweathermap.org/data/2.5/weather?q=" + _location +"&appid=1bff0457734a4b15bb9c9c7221671f42");

            HttpURLConnection http = (HttpURLConnection)url.openConnection();
            int length = http.getContentLength();
            int resCode = http.getResponseCode();
            String mime = http.getContentType();
            Scanner s = new Scanner(http.getInputStream(),"UTF-8");
            s.useDelimiter("\\z");
            content = s.next();
            s.close();

            try {
                EnvData data = parseData(content);
                return data;
            } catch (JAXBException e) {
                e.printStackTrace();
            }
            System.out.println(content);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * this method parse the Json String to an EnvData object
     * @param data provides the Json from the API call
     * @return parsed EnvData object
     * @throws JAXBException if something goes wrong
     */
    public EnvData parseData(String data) throws JAXBException {

        org.eclipse.persistence.oxm.MediaType type = MediaType.APPLICATION_JSON;

        JAXBContext jc = JAXBContext.newInstance(EnvDataWrapper.class);

        Unmarshaller um = jc.createUnmarshaller();
        um.setProperty(UnmarshallerProperties.MEDIA_TYPE, type);
        um.setProperty(JAXBContextProperties.JSON_INCLUDE_ROOT,false);
        StreamSource json = new StreamSource(new StringReader(data));

        EnvDataWrapper obj = um.unmarshal(json, EnvDataWrapper.class).getValue();
        System.out.println(obj);

        return obj.main;
    }
}


