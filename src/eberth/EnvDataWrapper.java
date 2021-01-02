package eberth;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * this class is to Wrap the EnvData from the API
 */
@XmlType(propOrder = {"main"})
public class EnvDataWrapper {

    @XmlElement(name = "main")
    EnvData main;

    /**
     * this empty constructor is not used (needed because of parsing)
     */
    EnvDataWrapper(){}

    /**
     * this constructor saves the main data from the API response into an EnvData object
     * @param main provides the main data from the api response
     */
    EnvDataWrapper(EnvData main){
        this.main = main;
    }
}
