package eberth;

import javax.jws.WebService;

/**
 * this interface contains all needed methods for the clients
 */
@WebService
public interface EnvironmentData {

    /**
     * this method is to test the connection
     * @return an test String
     */
    String saySomething();

    /**
     * this method is to get some supported city´s
     * @return a String Array with supported city´s in it
     */
    String[] requestEnvironmentDataTypes();

    /**
     * this method return a specific EnvData of the given city
     * @param _location is the city input of the client
     * @return the EnvData of the input location
     */
    EnvData getData(String _location);
}
