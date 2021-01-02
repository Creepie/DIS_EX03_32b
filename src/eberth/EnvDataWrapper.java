package eberth;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = {"main"})
public class EnvDataWrapper {

    @XmlElement(name = "main")
    EnvData main;

    EnvDataWrapper(){}

    EnvDataWrapper(EnvData main){
        this.main = main;
    }
}
