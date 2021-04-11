
package MIFID_III;

import java.io.Serializable;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Fi10 implements Serializable
{

    @SerializedName("volume")
    @Expose
    private List<String> volume = null;
    @SerializedName("FI_10_Q1")
    @Expose
    private String fi10Q1;
    @SerializedName("FI_10_Q2")
    @Expose
    private String fi10Q2;
    @SerializedName("FI_10_Q3")
    @Expose
    private String fi10Q3;
    @SerializedName("FI_Q1_A")
    @Expose
    private List<String> fiQ1A = null;
    @SerializedName("FI_Q2_A")
    @Expose
    private List<String> fiQ2A = null;
    @SerializedName("FI_Q3_A")
    @Expose
    private List<String> fiQ3A = null;
    private final static long serialVersionUID = -4628584077929245452L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Fi10() {
    }

    /**
     * 
     * @param volume
     * @param fiQ1A
     * @param fiQ3A
     * @param fiQ2A
     * @param fi10Q3
     * @param fi10Q1
     * @param fi10Q2
     */
    public Fi10(List<String> volume, String fi10Q1, String fi10Q2, String fi10Q3, List<String> fiQ1A, List<String> fiQ2A, List<String> fiQ3A) {
        super();
        this.volume = volume;
        this.fi10Q1 = fi10Q1;
        this.fi10Q2 = fi10Q2;
        this.fi10Q3 = fi10Q3;
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

    public Fi10 withVolume(List<String> volume) {
        this.volume = volume;
        return this;
    }

    public String getFi10Q1() {
        return fi10Q1;
    }

    public void setFi10Q1(String fi10Q1) {
        this.fi10Q1 = fi10Q1;
    }

    public Fi10 withFi10Q1(String fi10Q1) {
        this.fi10Q1 = fi10Q1;
        return this;
    }

    public String getFi10Q2() {
        return fi10Q2;
    }

    public void setFi10Q2(String fi10Q2) {
        this.fi10Q2 = fi10Q2;
    }

    public Fi10 withFi10Q2(String fi10Q2) {
        this.fi10Q2 = fi10Q2;
        return this;
    }

    public String getFi10Q3() {
        return fi10Q3;
    }

    public void setFi10Q3(String fi10Q3) {
        this.fi10Q3 = fi10Q3;
    }

    public Fi10 withFi10Q3(String fi10Q3) {
        this.fi10Q3 = fi10Q3;
        return this;
    }

    public List<String> getFiQ1A() {
        return fiQ1A;
    }

    public void setFiQ1A(List<String> fiQ1A) {
        this.fiQ1A = fiQ1A;
    }

    public Fi10 withFiQ1A(List<String> fiQ1A) {
        this.fiQ1A = fiQ1A;
        return this;
    }

    public List<String> getFiQ2A() {
        return fiQ2A;
    }

    public void setFiQ2A(List<String> fiQ2A) {
        this.fiQ2A = fiQ2A;
    }

    public Fi10 withFiQ2A(List<String> fiQ2A) {
        this.fiQ2A = fiQ2A;
        return this;
    }

    public List<String> getFiQ3A() {
        return fiQ3A;
    }

    public void setFiQ3A(List<String> fiQ3A) {
        this.fiQ3A = fiQ3A;
    }

    public Fi10 withFiQ3A(List<String> fiQ3A) {
        this.fiQ3A = fiQ3A;
        return this;
    }

}
