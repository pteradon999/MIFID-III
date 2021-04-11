
package MIFID_III;

import java.io.Serializable;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Fi8 implements Serializable
{

    @SerializedName("volume")
    @Expose
    private List<String> volume = null;
    @SerializedName("FI_8_Q1")
    @Expose
    private String fi8Q1;
    @SerializedName("FI_8_Q2")
    @Expose
    private String fi8Q2;
    @SerializedName("FI_8_Q3")
    @Expose
    private String fi8Q3;
    @SerializedName("FI_Q1_A")
    @Expose
    private List<String> fiQ1A = null;
    @SerializedName("FI_Q2_A")
    @Expose
    private List<String> fiQ2A = null;
    @SerializedName("FI_Q3_A")
    @Expose
    private List<String> fiQ3A = null;
    private final static long serialVersionUID = -6293015605974954202L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Fi8() {
    }

    /**
     * 
     * @param volume
     * @param fiQ1A
     * @param fiQ3A
     * @param fiQ2A
     * @param fi8Q1
     * @param fi8Q3
     * @param fi8Q2
     */
    public Fi8(List<String> volume, String fi8Q1, String fi8Q2, String fi8Q3, List<String> fiQ1A, List<String> fiQ2A, List<String> fiQ3A) {
        super();
        this.volume = volume;
        this.fi8Q1 = fi8Q1;
        this.fi8Q2 = fi8Q2;
        this.fi8Q3 = fi8Q3;
        this.fiQ1A = fiQ1A;
        this.fiQ2A = fiQ2A;
        this.fiQ3A = fiQ3A;
    }

    public List<String> getVolume() {
        return volume;
    }

    public void setVolume(List<String> volume) {
        this.volume = volume;
    }

    public Fi8 withVolume(List<String> volume) {
        this.volume = volume;
        return this;
    }

    public String getFi8Q1() {
        return fi8Q1;
    }

    public void setFi8Q1(String fi8Q1) {
        this.fi8Q1 = fi8Q1;
    }

    public Fi8 withFi8Q1(String fi8Q1) {
        this.fi8Q1 = fi8Q1;
        return this;
    }

    public String getFi8Q2() {
        return fi8Q2;
    }

    public void setFi8Q2(String fi8Q2) {
        this.fi8Q2 = fi8Q2;
    }

    public Fi8 withFi8Q2(String fi8Q2) {
        this.fi8Q2 = fi8Q2;
        return this;
    }

    public String getFi8Q3() {
        return fi8Q3;
    }

    public void setFi8Q3(String fi8Q3) {
        this.fi8Q3 = fi8Q3;
    }

    public Fi8 withFi8Q3(String fi8Q3) {
        this.fi8Q3 = fi8Q3;
        return this;
    }

    public List<String> getFiQ1A() {
        return fiQ1A;
    }

    public void setFiQ1A(List<String> fiQ1A) {
        this.fiQ1A = fiQ1A;
    }

    public Fi8 withFiQ1A(List<String> fiQ1A) {
        this.fiQ1A = fiQ1A;
        return this;
    }

    public List<String> getFiQ2A() {
        return fiQ2A;
    }

    public void setFiQ2A(List<String> fiQ2A) {
        this.fiQ2A = fiQ2A;
    }

    public Fi8 withFiQ2A(List<String> fiQ2A) {
        this.fiQ2A = fiQ2A;
        return this;
    }

    public List<String> getFiQ3A() {
        return fiQ3A;
    }

    public void setFiQ3A(List<String> fiQ3A) {
        this.fiQ3A = fiQ3A;
    }

    public Fi8 withFiQ3A(List<String> fiQ3A) {
        this.fiQ3A = fiQ3A;
        return this;
    }

}
