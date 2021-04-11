
package MIFID_III;

import java.io.Serializable;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Fi7 implements Serializable
{

    @SerializedName("volume")
    @Expose
    private List<String> volume = null;
    @SerializedName("FI_7_Q1")
    @Expose
    private String fi7Q1;
    @SerializedName("FI_7_Q2")
    @Expose
    private String fi7Q2;
    @SerializedName("FI_7_Q3")
    @Expose
    private String fi7Q3;
    @SerializedName("FI_Q1_A")
    @Expose
    private List<String> fiQ1A = null;
    @SerializedName("FI_Q2_A")
    @Expose
    private List<String> fiQ2A = null;
    @SerializedName("FI_Q3_A")
    @Expose
    private List<String> fiQ3A = null;
    private final static long serialVersionUID = -9039802576350256615L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Fi7() {
    }

    /**
     * 
     * @param volume
     * @param fiQ1A
     * @param fiQ3A
     * @param fiQ2A
     * @param fi7Q2
     * @param fi7Q1
     * @param fi7Q3
     */
    public Fi7(List<String> volume, String fi7Q1, String fi7Q2, String fi7Q3, List<String> fiQ1A, List<String> fiQ2A, List<String> fiQ3A) {
        super();
        this.volume = volume;
        this.fi7Q1 = fi7Q1;
        this.fi7Q2 = fi7Q2;
        this.fi7Q3 = fi7Q3;
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

    public Fi7 withVolume(List<String> volume) {
        this.volume = volume;
        return this;
    }

    public String getFi7Q1() {
        return fi7Q1;
    }

    public void setFi7Q1(String fi7Q1) {
        this.fi7Q1 = fi7Q1;
    }

    public Fi7 withFi7Q1(String fi7Q1) {
        this.fi7Q1 = fi7Q1;
        return this;
    }

    public String getFi7Q2() {
        return fi7Q2;
    }

    public void setFi7Q2(String fi7Q2) {
        this.fi7Q2 = fi7Q2;
    }

    public Fi7 withFi7Q2(String fi7Q2) {
        this.fi7Q2 = fi7Q2;
        return this;
    }

    public String getFi7Q3() {
        return fi7Q3;
    }

    public void setFi7Q3(String fi7Q3) {
        this.fi7Q3 = fi7Q3;
    }

    public Fi7 withFi7Q3(String fi7Q3) {
        this.fi7Q3 = fi7Q3;
        return this;
    }

    public List<String> getFiQ1A() {
        return fiQ1A;
    }

    public void setFiQ1A(List<String> fiQ1A) {
        this.fiQ1A = fiQ1A;
    }

    public Fi7 withFiQ1A(List<String> fiQ1A) {
        this.fiQ1A = fiQ1A;
        return this;
    }

    public List<String> getFiQ2A() {
        return fiQ2A;
    }

    public void setFiQ2A(List<String> fiQ2A) {
        this.fiQ2A = fiQ2A;
    }

    public Fi7 withFiQ2A(List<String> fiQ2A) {
        this.fiQ2A = fiQ2A;
        return this;
    }

    public List<String> getFiQ3A() {
        return fiQ3A;
    }

    public void setFiQ3A(List<String> fiQ3A) {
        this.fiQ3A = fiQ3A;
    }

    public Fi7 withFiQ3A(List<String> fiQ3A) {
        this.fiQ3A = fiQ3A;
        return this;
    }

}
