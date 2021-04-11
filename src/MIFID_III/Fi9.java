
package MIFID_III;

import java.io.Serializable;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Fi9 implements Serializable
{

    @SerializedName("volume")
    @Expose
    private List<String> volume = null;
    @SerializedName("FI_9_Q1")
    @Expose
    private String fi9Q1;
    @SerializedName("FI_9_Q2")
    @Expose
    private String fi9Q2;
    @SerializedName("FI_9_Q3")
    @Expose
    private String fi9Q3;
    @SerializedName("FI_Q1_A")
    @Expose
    private List<String> fiQ1A = null;
    @SerializedName("FI_Q2_A")
    @Expose
    private List<String> fiQ2A = null;
    @SerializedName("FI_Q3_A")
    @Expose
    private List<String> fiQ3A = null;
    private final static long serialVersionUID = -7490556822431948301L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Fi9() {
    }

    /**
     * 
     * @param volume
     * @param fiQ1A
     * @param fiQ3A
     * @param fiQ2A
     * @param fi9Q3
     * @param fi9Q2
     * @param fi9Q1
     */
    public Fi9(List<String> volume, String fi9Q1, String fi9Q2, String fi9Q3, List<String> fiQ1A, List<String> fiQ2A, List<String> fiQ3A) {
        super();
        this.volume = volume;
        this.fi9Q1 = fi9Q1;
        this.fi9Q2 = fi9Q2;
        this.fi9Q3 = fi9Q3;
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

    public Fi9 withVolume(List<String> volume) {
        this.volume = volume;
        return this;
    }

    public String getFi9Q1() {
        return fi9Q1;
    }

    public void setFi9Q1(String fi9Q1) {
        this.fi9Q1 = fi9Q1;
    }

    public Fi9 withFi9Q1(String fi9Q1) {
        this.fi9Q1 = fi9Q1;
        return this;
    }

    public String getFi9Q2() {
        return fi9Q2;
    }

    public void setFi9Q2(String fi9Q2) {
        this.fi9Q2 = fi9Q2;
    }

    public Fi9 withFi9Q2(String fi9Q2) {
        this.fi9Q2 = fi9Q2;
        return this;
    }

    public String getFi9Q3() {
        return fi9Q3;
    }

    public void setFi9Q3(String fi9Q3) {
        this.fi9Q3 = fi9Q3;
    }

    public Fi9 withFi9Q3(String fi9Q3) {
        this.fi9Q3 = fi9Q3;
        return this;
    }

    public List<String> getFiQ1A() {
        return fiQ1A;
    }

    public void setFiQ1A(List<String> fiQ1A) {
        this.fiQ1A = fiQ1A;
    }

    public Fi9 withFiQ1A(List<String> fiQ1A) {
        this.fiQ1A = fiQ1A;
        return this;
    }

    public List<String> getFiQ2A() {
        return fiQ2A;
    }

    public void setFiQ2A(List<String> fiQ2A) {
        this.fiQ2A = fiQ2A;
    }

    public Fi9 withFiQ2A(List<String> fiQ2A) {
        this.fiQ2A = fiQ2A;
        return this;
    }

    public List<String> getFiQ3A() {
        return fiQ3A;
    }

    public void setFiQ3A(List<String> fiQ3A) {
        this.fiQ3A = fiQ3A;
    }

    public Fi9 withFiQ3A(List<String> fiQ3A) {
        this.fiQ3A = fiQ3A;
        return this;
    }

}
