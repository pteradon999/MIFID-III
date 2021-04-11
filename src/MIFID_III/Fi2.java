
package MIFID_III;

import java.io.Serializable;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Fi2 implements Serializable
{

    @SerializedName("volume")
    @Expose
    private List<String> volume = null;
    @SerializedName("FI_2_Q1")
    @Expose
    private String fi2Q1;
    @SerializedName("FI_2_Q2")
    @Expose
    private String fi2Q2;
    @SerializedName("FI_2_Q3")
    @Expose
    private String fi2Q3;
    @SerializedName("FI_Q1_A")
    @Expose
    private List<String> fiQ1A = null;
    @SerializedName("FI_Q2_A")
    @Expose
    private List<String> fiQ2A = null;
    @SerializedName("FI_Q3_A")
    @Expose
    private List<String> fiQ3A = null;
    private final static long serialVersionUID = 5776845318729588192L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Fi2() {
    }

    /**
     * 
     * @param volume
     * @param fiQ1A
     * @param fi2Q1
     * @param fiQ3A
     * @param fiQ2A
     * @param fi2Q3
     * @param fi2Q2
     */
    public Fi2(List<String> volume, String fi2Q1, String fi2Q2, String fi2Q3, List<String> fiQ1A, List<String> fiQ2A, List<String> fiQ3A) {
        super();
        this.volume = volume;
        this.fi2Q1 = fi2Q1;
        this.fi2Q2 = fi2Q2;
        this.fi2Q3 = fi2Q3;
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

    public Fi2 withVolume(List<String> volume) {
        this.volume = volume;
        return this;
    }

    public String getFi2Q1() {
        return fi2Q1;
    }

    public void setFi2Q1(String fi2Q1) {
        this.fi2Q1 = fi2Q1;
    }

    public Fi2 withFi2Q1(String fi2Q1) {
        this.fi2Q1 = fi2Q1;
        return this;
    }

    public String getFi2Q2() {
        return fi2Q2;
    }

    public void setFi2Q2(String fi2Q2) {
        this.fi2Q2 = fi2Q2;
    }

    public Fi2 withFi2Q2(String fi2Q2) {
        this.fi2Q2 = fi2Q2;
        return this;
    }

    public String getFi2Q3() {
        return fi2Q3;
    }

    public void setFi2Q3(String fi2Q3) {
        this.fi2Q3 = fi2Q3;
    }

    public Fi2 withFi2Q3(String fi2Q3) {
        this.fi2Q3 = fi2Q3;
        return this;
    }

    public List<String> getFiQ1A() {
        return fiQ1A;
    }

    public void setFiQ1A(List<String> fiQ1A) {
        this.fiQ1A = fiQ1A;
    }

    public Fi2 withFiQ1A(List<String> fiQ1A) {
        this.fiQ1A = fiQ1A;
        return this;
    }

    public List<String> getFiQ2A() {
        return fiQ2A;
    }

    public void setFiQ2A(List<String> fiQ2A) {
        this.fiQ2A = fiQ2A;
    }

    public Fi2 withFiQ2A(List<String> fiQ2A) {
        this.fiQ2A = fiQ2A;
        return this;
    }

    public List<String> getFiQ3A() {
        return fiQ3A;
    }

    public void setFiQ3A(List<String> fiQ3A) {
        this.fiQ3A = fiQ3A;
    }

    public Fi2 withFiQ3A(List<String> fiQ3A) {
        this.fiQ3A = fiQ3A;
        return this;
    }

}
