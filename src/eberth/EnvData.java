package eberth;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * this class is to parse the Json from the API call into an EnvData object
 */
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

    /**
     * this empty constructor is not used (needed because of parsing)
     */
    EnvData(){}

    /**
     * in the constructor the input data got saved into the EnvData obj
     * @param mTemp contains the current temp of the city
     * @param feels_like contains the feels like temp of the city
     * @param temp_min contains the minimum temp of the city
     * @param temp_max contains the maximum temp of the city
     * @param pressure contains the pressure of the city
     * @param humidity contains the humidity of the city
     */
    public EnvData(double mTemp, double feels_like, double temp_min, double temp_max, int pressure, int humidity) {
        this.mTemp = mTemp;
        this.mFeels_like = feels_like;
        this.mTemp_min = temp_min;
        this.mTemp_max = temp_max;
        this.mPressure = pressure;
        this.mHumidity = humidity;
    }
}
