package eberth;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class DummyData {

    @XmlElement
    String mText;
    @XmlElement
    long mTime;

    DummyData(){}

    DummyData(String _name, long _time){
     mText = _name;
     mTime = _time;
    }

    @Override
    public String toString() {
        return "DummyData{" +
                "mText='" + mText + '\'' +
                ", mTime=" + mTime +
                '}';
    }
}
