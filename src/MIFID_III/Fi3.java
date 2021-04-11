
package MIFID_III;

import java.io.Serializable;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Fi3 implements Serializable
{

    @SerializedName("volume")
    @Expose
    private List<String> volume = null;
    @SerializedName("FI_3_Q1")
    @Expose
    private String fi3Q1;
    @SerializedName("FI_3_Q2")
    @Expose
    private String fi3Q2;
    @SerializedName("FI_3_Q3")
    @Expose
    private String fi3Q3;
    @SerializedName("FI_Q1_A")
    @Expose
    private List<String> fiQ1A = null;
    @SerializedName("FI_Q2_A")
    @Expose
    private List<String> fiQ2A = null;
    @SerializedName("FI_Q3_A")
    @Expose
    private List<String> fiQ3A = null;
    private final static long serialVersionUID = -6656609401310780692L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Fi3() {
    }

    /**
     * 
     * @param volume
     * @param fiQ1A
     * @param fiQ3A
     * @param fiQ2A
     * @param fi3Q2
     * @param fi3Q1
     * @param fi3Q3
     */
    public Fi3(List<String> volume, String fi3Q1, String fi3Q2, String fi3Q3, List<String> fiQ1A, List<String> fiQ2A, List<String> fiQ3A) {
        super();
        this.volume = volume;
        this.fi3Q1 = fi3Q1;
        this.fi3Q2 = fi3Q2;
        this.fi3Q3 = fi3Q3;
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

    public Fi3 withVolume(List<String> volume) {
        this.volume = volume;
        return this;
    }

    public String getFi3Q1() {
        return fi3Q1;
    }

    public void setFi3Q1(String fi3Q1) {
        this.fi3Q1 = fi3Q1;
    }

    public Fi3 withFi3Q1(String fi3Q1) {
        this.fi3Q1 = fi3Q1;
        return this;
    }

    public String getFi3Q2() {
        return fi3Q2;
    }

    public void setFi3Q2(String fi3Q2) {
        this.fi3Q2 = fi3Q2;
    }

    public Fi3 withFi3Q2(String fi3Q2) {
        this.fi3Q2 = fi3Q2;
        return this;
    }

    public String getFi3Q3() {
        return fi3Q3;
    }

    public void setFi3Q3(String fi3Q3) {
        this.fi3Q3 = fi3Q3;
    }

    public Fi3 withFi3Q3(String fi3Q3) {
        this.fi3Q3 = fi3Q3;
        return this;
    }

    public List<String> getFiQ1A() {
        return fiQ1A;
    }

    public void setFiQ1A(List<String> fiQ1A) {
        this.fiQ1A = fiQ1A;
    }

    public Fi3 withFiQ1A(List<String> fiQ1A) {
        this.fiQ1A = fiQ1A;
        return this;
    }

    public List<String> getFiQ2A() {
        return fiQ2A;
    }

    public void setFiQ2A(List<String> fiQ2A) {
        this.fiQ2A = fiQ2A;
    }

    public Fi3 withFiQ2A(List<String> fiQ2A) {
        this.fiQ2A = fiQ2A;
        return this;
    }

    public List<String> getFiQ3A() {
        return fiQ3A;
    }

    public void setFiQ3A(List<String> fiQ3A) {
        this.fiQ3A = fiQ3A;
    }

    public Fi3 withFiQ3A(List<String> fiQ3A) {
        this.fiQ3A = fiQ3A;
        return this;
    }

}
