package eberth;

import javax.jws.WebService;

@WebService
public interface EnvironmentData {
    String saySomething();
    String requestEnvironmentDataTypes();
}
