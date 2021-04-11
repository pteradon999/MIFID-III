
package MIFID_III;

import java.io.Serializable;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Fi6 implements Serializable
{

    @SerializedName("volume")
    @Expose
    private List<String> volume = null;
    @SerializedName("FI_6_Q1")
    @Expose
    private String fi6Q1;
    @SerializedName("FI_6_Q2")
    @Expose
    private String fi6Q2;
    @SerializedName("FI_6_Q3")
    @Expose
    private String fi6Q3;
    @SerializedName("FI_Q1_A")
    @Expose
    private List<String> fiQ1A = null;
    @SerializedName("FI_Q2_A")
    @Expose
    private List<String> fiQ2A = null;
    @SerializedName("FI_Q3_A")
    @Expose
    private List<String> fiQ3A = null;
    private final static long serialVersionUID = 8911855350197919036L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Fi6() {
    }

    /**
     * 
     * @param volume
     * @param fiQ1A
     * @param fiQ3A
     * @param fiQ2A
     * @param fi6Q3
     * @param fi6Q2
     * @param fi6Q1
     */
    public Fi6(List<String> volume, String fi6Q1, String fi6Q2, String fi6Q3, List<String> fiQ1A, List<String> fiQ2A, List<String> fiQ3A) {
        super();
        this.volume = volume;
        this.fi6Q1 = fi6Q1;
        this.fi6Q2 = fi6Q2;
        this.fi6Q3 = fi6Q3;
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

    public Fi6 withVolume(List<String> volume) {
        this.volume = volume;
        return this;
    }

    public String getFi6Q1() {
        return fi6Q1;
    }

    public void setFi6Q1(String fi6Q1) {
        this.fi6Q1 = fi6Q1;
    }

    public Fi6 withFi6Q1(String fi6Q1) {
        this.fi6Q1 = fi6Q1;
        return this;
    }

    public String getFi6Q2() {
        return fi6Q2;
    }

    public void setFi6Q2(String fi6Q2) {
        this.fi6Q2 = fi6Q2;
    }

    public Fi6 withFi6Q2(String fi6Q2) {
        this.fi6Q2 = fi6Q2;
        return this;
    }

    public String getFi6Q3() {
        return fi6Q3;
    }

    public void setFi6Q3(String fi6Q3) {
        this.fi6Q3 = fi6Q3;
    }

    public Fi6 withFi6Q3(String fi6Q3) {
        this.fi6Q3 = fi6Q3;
        return this;
    }

    public List<String> getFiQ1A() {
        return fiQ1A;
    }

    public void setFiQ1A(List<String> fiQ1A) {
        this.fiQ1A = fiQ1A;
    }

    public Fi6 withFiQ1A(List<String> fiQ1A) {
        this.fiQ1A = fiQ1A;
        return this;
    }

    public List<String> getFiQ2A() {
        return fiQ2A;
    }

    public void setFiQ2A(List<String> fiQ2A) {
        this.fiQ2A = fiQ2A;
    }

    public Fi6 withFiQ2A(List<String> fiQ2A) {
        this.fiQ2A = fiQ2A;
        return this;
    }

    public List<String> getFiQ3A() {
        return fiQ3A;
    }

    public void setFiQ3A(List<String> fiQ3A) {
        this.fiQ3A = fiQ3A;
    }

    public Fi6 withFiQ3A(List<String> fiQ3A) {
        this.fiQ3A = fiQ3A;
        return this;
    }

}
