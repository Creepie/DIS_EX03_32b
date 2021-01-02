package eberth;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(endpointInterface = "eberth.ISimpleInterface")
public class HelloWorld implements EnvironmentData {

    @Override
    @WebMethod
    public String saySomething(){
        return "Hello World";
    }

    @Override
    public String requestEnvironmentDataTypes() {
        return null;
    }


}


