
package MIFID_III;

import java.io.Serializable;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Language implements Serializable
{

    @SerializedName("language")
    @Expose
    private Language__1 language;
    private final static long serialVersionUID = -348255725215168782L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Language() {
    }

    /**
     * 
     * @param language
     */
    public Language(Language__1 language) {
        super();
        this.language = language;
    }

    public Language__1 getLanguage() {
        return language;
    }

    public void setLanguage(Language__1 language) {
        this.language = language;
    }

    public Language withLanguage(Language__1 language) {
        this.language = language;
        return this;
    }

}
