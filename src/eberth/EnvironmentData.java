package eberth;

import javax.jws.WebService;

@WebService
public interface EnvironmentData {
    String saySomething();
    String[] requestEnvironmentDataTypes();
    EnvData getData(String _location);
}
