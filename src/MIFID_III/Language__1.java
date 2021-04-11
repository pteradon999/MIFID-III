
package MIFID_III;

import java.io.Serializable;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Language__1 implements Serializable
{

    @SerializedName("LV")
    @Expose
    private Lv lv;
    private final static long serialVersionUID = 4312643256596549633L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Language__1() {
    }

    /**
     * 
     * @param lv
     */
    public Language__1(Lv lv) {
        super();
        this.lv = lv;
    }

    public Lv getLv() {
        return lv;
    }

    public void setLv(Lv lv) {
        this.lv = lv;
    }

    public Language__1 withLv(Lv lv) {
        this.lv = lv;
        return this;
    }

}
