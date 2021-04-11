
package MIFID_III;

import java.io.Serializable;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Fi1 implements Serializable
{

    @SerializedName("volume")
    @Expose
    private List<String> volume = null;
    @SerializedName("FI_1_Q1")
    @Expose
    private String fi1Q1;
    @SerializedName("FI_1_Q2")
    @Expose
    private String fi1Q2;
    @SerializedName("FI_1_Q3")
    @Expose
    private String fi1Q3;
    @SerializedName("FI_Q1_A")
    @Expose
    private List<String> fiQ1A = null;
    @SerializedName("FI_Q2_A")
    @Expose
    private List<String> fiQ2A = null;
    @SerializedName("FI_Q3_A")
    @Expose
    private List<String> fiQ3A = null;
    private final static long serialVersionUID = -4339083076762806194L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Fi1() {
    }

    /**
     * 
     * @param volume
     * @param fiQ1A
     * @param fi1Q2
     * @param fiQ3A
     * @param fi1Q1
     * @param fiQ2A
     * @param fi1Q3
     */
    public Fi1(List<String> volume, String fi1Q1, String fi1Q2, String fi1Q3, List<String> fiQ1A, List<String> fiQ2A, List<String> fiQ3A) {
        super();
        this.volume = volume;
        this.fi1Q1 = fi1Q1;
        this.fi1Q2 = fi1Q2;
        this.fi1Q3 = fi1Q3;
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

    public Fi1 withVolume(List<String> volume) {
        this.volume = volume;
        return this;
    }

    public String getFi1Q1() {
        return fi1Q1;
    }

    public void setFi1Q1(String fi1Q1) {
        this.fi1Q1 = fi1Q1;
    }

    public Fi1 withFi1Q1(String fi1Q1) {
        this.fi1Q1 = fi1Q1;
        return this;
    }

    public String getFi1Q2() {
        return fi1Q2;
    }

    public void setFi1Q2(String fi1Q2) {
        this.fi1Q2 = fi1Q2;
    }

    public Fi1 withFi1Q2(String fi1Q2) {
        this.fi1Q2 = fi1Q2;
        return this;
    }

    public String getFi1Q3() {
        return fi1Q3;
    }

    public void setFi1Q3(String fi1Q3) {
        this.fi1Q3 = fi1Q3;
    }

    public Fi1 withFi1Q3(String fi1Q3) {
        this.fi1Q3 = fi1Q3;
        return this;
    }

    public List<String> getFiQ1A() {
        return fiQ1A;
    }

    public void setFiQ1A(List<String> fiQ1A) {
        this.fiQ1A = fiQ1A;
    }

    public Fi1 withFiQ1A(List<String> fiQ1A) {
        this.fiQ1A = fiQ1A;
        return this;
    }

    public List<String> getFiQ2A() {
        return fiQ2A;
    }

    public void setFiQ2A(List<String> fiQ2A) {
        this.fiQ2A = fiQ2A;
    }

    public Fi1 withFiQ2A(List<String> fiQ2A) {
        this.fiQ2A = fiQ2A;
        return this;
    }

    public List<String> getFiQ3A() {
        return fiQ3A;
    }

    public void setFiQ3A(List<String> fiQ3A) {
        this.fiQ3A = fiQ3A;
    }

    public Fi1 withFiQ3A(List<String> fiQ3A) {
        this.fiQ3A = fiQ3A;
        return this;
    }

}
