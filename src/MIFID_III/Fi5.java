
package MIFID_III;

import java.io.Serializable;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Fi5 implements Serializable
{

    @SerializedName("volume")
    @Expose
    private List<String> volume = null;
    @SerializedName("FI_5_Q1")
    @Expose
    private String fi5Q1;
    @SerializedName("FI_5_Q2")
    @Expose
    private String fi5Q2;
    @SerializedName("FI_5_Q3")
    @Expose
    private String fi5Q3;
    @SerializedName("FI_Q1_A")
    @Expose
    private List<String> fiQ1A = null;
    @SerializedName("FI_Q2_A")
    @Expose
    private List<String> fiQ2A = null;
    @SerializedName("FI_Q3_A")
    @Expose
    private List<String> fiQ3A = null;
    private final static long serialVersionUID = -8852566290722555557L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Fi5() {
    }

    /**
     * 
     * @param volume
     * @param fiQ1A
     * @param fiQ3A
     * @param fiQ2A
     * @param fi5Q3
     * @param fi5Q2
     * @param fi5Q1
     */
    public Fi5(List<String> volume, String fi5Q1, String fi5Q2, String fi5Q3, List<String> fiQ1A, List<String> fiQ2A, List<String> fiQ3A) {
        super();
        this.volume = volume;
        this.fi5Q1 = fi5Q1;
        this.fi5Q2 = fi5Q2;
        this.fi5Q3 = fi5Q3;
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

    public Fi5 withVolume(List<String> volume) {
        this.volume = volume;
        return this;
    }

    public String getFi5Q1() {
        return fi5Q1;
    }

    public void setFi5Q1(String fi5Q1) {
        this.fi5Q1 = fi5Q1;
    }

    public Fi5 withFi5Q1(String fi5Q1) {
        this.fi5Q1 = fi5Q1;
        return this;
    }

    public String getFi5Q2() {
        return fi5Q2;
    }

    public void setFi5Q2(String fi5Q2) {
        this.fi5Q2 = fi5Q2;
    }

    public Fi5 withFi5Q2(String fi5Q2) {
        this.fi5Q2 = fi5Q2;
        return this;
    }

    public String getFi5Q3() {
        return fi5Q3;
    }

    public void setFi5Q3(String fi5Q3) {
        this.fi5Q3 = fi5Q3;
    }

    public Fi5 withFi5Q3(String fi5Q3) {
        this.fi5Q3 = fi5Q3;
        return this;
    }

    public List<String> getFiQ1A() {
        return fiQ1A;
    }

    public void setFiQ1A(List<String> fiQ1A) {
        this.fiQ1A = fiQ1A;
    }

    public Fi5 withFiQ1A(List<String> fiQ1A) {
        this.fiQ1A = fiQ1A;
        return this;
    }

    public List<String> getFiQ2A() {
        return fiQ2A;
    }

    public void setFiQ2A(List<String> fiQ2A) {
        this.fiQ2A = fiQ2A;
    }

    public Fi5 withFiQ2A(List<String> fiQ2A) {
        this.fiQ2A = fiQ2A;
        return this;
    }

    public List<String> getFiQ3A() {
        return fiQ3A;
    }

    public void setFiQ3A(List<String> fiQ3A) {
        this.fiQ3A = fiQ3A;
    }

    public Fi5 withFiQ3A(List<String> fiQ3A) {
        this.fiQ3A = fiQ3A;
        return this;
    }

}
