
package Scens;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class ScenScan {

    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("values")
    @Expose
    private List<Integer> values = null;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ScenScan withId(int id) {
        this.id = id;
        return this;
    }

    public List<Integer> getValues() {
        return values;
    }

    public void setValues(List<Integer> values) {
        this.values = values;
    }

    public ScenScan withValues(List<Integer> values) {
        this.values = values;
        return this;
    }

}
