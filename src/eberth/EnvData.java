package eberth;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class EnvData {
    @XmlElement(name = "temp")
    double mTemp;
    @XmlElement(name = "feels_like")
    double mFeels_like;
    @XmlElement(name = "temp_min")
    double mTemp_min;
    @XmlElement(name = "temp_max")
    double mTemp_max;
    @XmlElement(name = "pressure")
    int mPressure;
    @XmlElement(name = "humidity")
    int mHumidity;

    EnvData(){}

    public EnvData(double mTemp, double feels_like, double temp_min, double temp_max, int pressure, int humidity) {
        this.mTemp = mTemp;
        this.mFeels_like = feels_like;
        this.mTemp_min = temp_min;
        this.mTemp_max = temp_max;
        this.mPressure = pressure;
        this.mHumidity = humidity;
    }
}
