
package MIFID_III;

import java.io.Serializable;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Lv implements Serializable
{

    @SerializedName("Company_Name")
    @Expose
    private String companyName;
    @SerializedName("Reg_Num")
    @Expose
    private String regNum;
    @SerializedName("Reg_country")
    @Expose
    private String regCountry;
    @SerializedName("Name_Surname")
    @Expose
    private String nameSurname;
    @SerializedName("Pers_code")
    @Expose
    private String persCode;
    @SerializedName("Pars_pam")
    @Expose
    private String parsPam;
    @SerializedName("Pars_pam_var")
    @Expose
    private List<String> parsPamVar = null;
    @SerializedName("client_port_q_1")
    @Expose
    private String clientPortQ1;
    @SerializedName("client_port_q_2")
    @Expose
    private String clientPortQ2;
    @SerializedName("client_port_q_3")
    @Expose
    private String clientPortQ3;
    @SerializedName("education")
    @Expose
    private String education;
    @SerializedName("educations")
    @Expose
    private List<String> educations = null;
    @SerializedName("prev_workplace")
    @Expose
    private String prevWorkplace;
    @SerializedName("prev_workplaces")
    @Expose
    private List<String> prevWorkplaces = null;
    @SerializedName("prev_workplace_name")
    @Expose
    private String prevWorkplaceName;
    @SerializedName("prev_worlpace_country")
    @Expose
    private String prevWorlpaceCountry;
    @SerializedName("workexp")
    @Expose
    private String workexp;
    @SerializedName("client_q_4")
    @Expose
    private String clientQ4;
    @SerializedName("FI_thumbnail")
    @Expose
    private String fIThumbnail;
    @SerializedName("kn_exp_thumbnail")
    @Expose
    private String knExpThumbnail;
    @SerializedName("FI_understanding_thumbnail")
    @Expose
    private String fIUnderstandingThumbnail;
    @SerializedName("exp_thumbnail")
    @Expose
    private String expThumbnail;
    @SerializedName("FI_quantity_thumbnail")
    @Expose
    private String fIQuantityThumbnail;
    @SerializedName("FI_volume_thumbnail")
    @Expose
    private String fIVolumeThumbnail;
    @SerializedName("FI_TA_thumbnail")
    @Expose
    private String fITAThumbnail;
    @SerializedName("kn_exp_thumbnail_sec")
    @Expose
    private String knExpThumbnailSec;
    @SerializedName("kn_exp_thumbnail_atb")
    @Expose
    private List<String> knExpThumbnailAtb = null;
    @SerializedName("FI_underst_thumb_sec")
    @Expose
    private String fIUnderstThumbSec;
    @SerializedName("FI_underst_thumb_atb")
    @Expose
    private List<String> fIUnderstThumbAtb = null;
    @SerializedName("FI_exp_thumb_sec")
    @Expose
    private String fIExpThumbSec;
    @SerializedName("FI_exp_thumb_atb")
    @Expose
    private List<String> fIExpThumbAtb = null;
    @SerializedName("FI_quantity_thumbnail_sec")
    @Expose
    private String fIQuantityThumbnailSec;
    @SerializedName("FI_quantity_thumbnail_atb")
    @Expose
    private List<String> fIQuantityThumbnailAtb = null;
    @SerializedName("FI_volume_thumbnail_sec")
    @Expose
    private String fIVolumeThumbnailSec;
    @SerializedName("FI_1")
    @Expose
    private Fi1 fi1;
    @SerializedName("FI_2")
    @Expose
    private Fi2 fi2;
    @SerializedName("FI_3")
    @Expose
    private Fi3 fi3;
    @SerializedName("FI_4")
    @Expose
    private Fi4 fi4;
    @SerializedName("FI_5")
    @Expose
    private Fi5 fi5;
    @SerializedName("FI_6")
    @Expose
    private Fi6 fi6;
    @SerializedName("FI_7")
    @Expose
    private Fi7 fi7;
    @SerializedName("FI_8")
    @Expose
    private Fi8 fi8;
    @SerializedName("FI_9")
    @Expose
    private Fi9 fi9;
    @SerializedName("FI_10")
    @Expose
    private Fi10 fi10;
    private final static long serialVersionUID = -7949423577586360117L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Lv() {
    }

    /**
     * 
     * @param prevWorkplace
     * @param education
     * @param workexp
     * @param fIUnderstThumbAtb
     * @param companyName
     * @param nameSurname
     * @param educations
     * @param fi10
     * @param fi2
     * @param fi1
     * @param fi4
     * @param fi3
     * @param fi6
     * @param fi5
     * @param fIUnderstandingThumbnail
     * @param fi8
     * @param regNum
     * @param persCode
     * @param fi7
     * @param fIQuantityThumbnail
     * @param fi9
     * @param fIUnderstThumbSec
     * @param clientPortQ3
     * @param fIThumbnail
     * @param clientPortQ2
     * @param clientPortQ1
     * @param expThumbnail
     * @param knExpThumbnail
     * @param clientQ4
     * @param fIExpThumbSec
     * @param fIExpThumbAtb
     * @param parsPam
     * @param fITAThumbnail
     * @param fIVolumeThumbnailSec
     * @param parsPamVar
     * @param prevWorkplaces
     * @param prevWorlpaceCountry
     * @param prevWorkplaceName
     * @param fIVolumeThumbnail
     * @param fIQuantityThumbnailAtb
     * @param fIQuantityThumbnailSec
     * @param knExpThumbnailAtb
     * @param knExpThumbnailSec
     * @param regCountry
     */
    public Lv(String companyName, String regNum, String regCountry, String nameSurname, String persCode, String parsPam, List<String> parsPamVar, String clientPortQ1, String clientPortQ2, String clientPortQ3, String education, List<String> educations, String prevWorkplace, List<String> prevWorkplaces, String prevWorkplaceName, String prevWorlpaceCountry, String workexp, String clientQ4, String fIThumbnail, String knExpThumbnail, String fIUnderstandingThumbnail, String expThumbnail, String fIQuantityThumbnail, String fIVolumeThumbnail, String fITAThumbnail, String knExpThumbnailSec, List<String> knExpThumbnailAtb, String fIUnderstThumbSec, List<String> fIUnderstThumbAtb, String fIExpThumbSec, List<String> fIExpThumbAtb, String fIQuantityThumbnailSec, List<String> fIQuantityThumbnailAtb, String fIVolumeThumbnailSec, Fi1 fi1, Fi2 fi2, Fi3 fi3, Fi4 fi4, Fi5 fi5, Fi6 fi6, Fi7 fi7, Fi8 fi8, Fi9 fi9, Fi10 fi10) {
        super();
        this.companyName = companyName;
        this.regNum = regNum;
        this.regCountry = regCountry;
        this.nameSurname = nameSurname;
        this.persCode = persCode;
        this.parsPam = parsPam;
        this.parsPamVar = parsPamVar;
        this.clientPortQ1 = clientPortQ1;
        this.clientPortQ2 = clientPortQ2;
        this.clientPortQ3 = clientPortQ3;
        this.education = education;
        this.educations = educations;
        this.prevWorkplace = prevWorkplace;
        this.prevWorkplaces = prevWorkplaces;
        this.prevWorkplaceName = prevWorkplaceName;
        this.prevWorlpaceCountry = prevWorlpaceCountry;
        this.workexp = workexp;
        this.clientQ4 = clientQ4;
        this.fIThumbnail = fIThumbnail;
        this.knExpThumbnail = knExpThumbnail;
        this.fIUnderstandingThumbnail = fIUnderstandingThumbnail;
        this.expThumbnail = expThumbnail;
        this.fIQuantityThumbnail = fIQuantityThumbnail;
        this.fIVolumeThumbnail = fIVolumeThumbnail;
        this.fITAThumbnail = fITAThumbnail;
        this.knExpThumbnailSec = knExpThumbnailSec;
        this.knExpThumbnailAtb = knExpThumbnailAtb;
        this.fIUnderstThumbSec = fIUnderstThumbSec;
        this.fIUnderstThumbAtb = fIUnderstThumbAtb;
        this.fIExpThumbSec = fIExpThumbSec;
        this.fIExpThumbAtb = fIExpThumbAtb;
        this.fIQuantityThumbnailSec = fIQuantityThumbnailSec;
        this.fIQuantityThumbnailAtb = fIQuantityThumbnailAtb;
        this.fIVolumeThumbnailSec = fIVolumeThumbnailSec;
        this.fi1 = fi1;
        this.fi2 = fi2;
        this.fi3 = fi3;
        this.fi4 = fi4;
        this.fi5 = fi5;
        this.fi6 = fi6;
        this.fi7 = fi7;
        this.fi8 = fi8;
        this.fi9 = fi9;
        this.fi10 = fi10;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Lv withCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    public String getRegNum() {
        return regNum;
    }

    public void setRegNum(String regNum) {
        this.regNum = regNum;
    }

    public Lv withRegNum(String regNum) {
        this.regNum = regNum;
        return this;
    }

    public String getRegCountry() {
        return regCountry;
    }

    public void setRegCountry(String regCountry) {
        this.regCountry = regCountry;
    }

    public Lv withRegCountry(String regCountry) {
        this.regCountry = regCountry;
        return this;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public Lv withNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
        return this;
    }

    public String getPersCode() {
        return persCode;
    }

    public void setPersCode(String persCode) {
        this.persCode = persCode;
    }

    public Lv withPersCode(String persCode) {
        this.persCode = persCode;
        return this;
    }

    public String getParsPam() {
        return parsPam;
    }

    public void setParsPam(String parsPam) {
        this.parsPam = parsPam;
    }

    public Lv withParsPam(String parsPam) {
        this.parsPam = parsPam;
        return this;
    }

    public List<String> getParsPamVar() {
        return parsPamVar;
    }

    public void setParsPamVar(List<String> parsPamVar) {
        this.parsPamVar = parsPamVar;
    }

    public Lv withParsPamVar(List<String> parsPamVar) {
        this.parsPamVar = parsPamVar;
        return this;
    }

    public String getClientPortQ1() {
        return clientPortQ1;
    }

    public void setClientPortQ1(String clientPortQ1) {
        this.clientPortQ1 = clientPortQ1;
    }

    public Lv withClientPortQ1(String clientPortQ1) {
        this.clientPortQ1 = clientPortQ1;
        return this;
    }

    public String getClientPortQ2() {
        return clientPortQ2;
    }

    public void setClientPortQ2(String clientPortQ2) {
        this.clientPortQ2 = clientPortQ2;
    }

    public Lv withClientPortQ2(String clientPortQ2) {
        this.clientPortQ2 = clientPortQ2;
        return this;
    }

    public String getClientPortQ3() {
        return clientPortQ3;
    }

    public void setClientPortQ3(String clientPortQ3) {
        this.clientPortQ3 = clientPortQ3;
    }

    public Lv withClientPortQ3(String clientPortQ3) {
        this.clientPortQ3 = clientPortQ3;
        return this;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public Lv withEducation(String education) {
        this.education = education;
        return this;
    }

    public List<String> getEducations() {
        return educations;
    }

    public void setEducations(List<String> educations) {
        this.educations = educations;
    }

    public Lv withEducations(List<String> educations) {
        this.educations = educations;
        return this;
    }

    public String getPrevWorkplace() {
        return prevWorkplace;
    }

    public void setPrevWorkplace(String prevWorkplace) {
        this.prevWorkplace = prevWorkplace;
    }

    public Lv withPrevWorkplace(String prevWorkplace) {
        this.prevWorkplace = prevWorkplace;
        return this;
    }

    public List<String> getPrevWorkplaces() {
        return prevWorkplaces;
    }

    public void setPrevWorkplaces(List<String> prevWorkplaces) {
        this.prevWorkplaces = prevWorkplaces;
    }

    public Lv withPrevWorkplaces(List<String> prevWorkplaces) {
        this.prevWorkplaces = prevWorkplaces;
        return this;
    }

    public String getPrevWorkplaceName() {
        return prevWorkplaceName;
    }

    public void setPrevWorkplaceName(String prevWorkplaceName) {
        this.prevWorkplaceName = prevWorkplaceName;
    }

    public Lv withPrevWorkplaceName(String prevWorkplaceName) {
        this.prevWorkplaceName = prevWorkplaceName;
        return this;
    }

    public String getPrevWorlpaceCountry() {
        return prevWorlpaceCountry;
    }

    public void setPrevWorlpaceCountry(String prevWorlpaceCountry) {
        this.prevWorlpaceCountry = prevWorlpaceCountry;
    }

    public Lv withPrevWorlpaceCountry(String prevWorlpaceCountry) {
        this.prevWorlpaceCountry = prevWorlpaceCountry;
        return this;
    }

    public String getWorkexp() {
        return workexp;
    }

    public void setWorkexp(String workexp) {
        this.workexp = workexp;
    }

    public Lv withWorkexp(String workexp) {
        this.workexp = workexp;
        return this;
    }

    public String getClientQ4() {
        return clientQ4;
    }

    public void setClientQ4(String clientQ4) {
        this.clientQ4 = clientQ4;
    }

    public Lv withClientQ4(String clientQ4) {
        this.clientQ4 = clientQ4;
        return this;
    }

    public String getFIThumbnail() {
        return fIThumbnail;
    }

    public void setFIThumbnail(String fIThumbnail) {
        this.fIThumbnail = fIThumbnail;
    }

    public Lv withFIThumbnail(String fIThumbnail) {
        this.fIThumbnail = fIThumbnail;
        return this;
    }

    public String getKnExpThumbnail() {
        return knExpThumbnail;
    }

    public void setKnExpThumbnail(String knExpThumbnail) {
        this.knExpThumbnail = knExpThumbnail;
    }

    public Lv withKnExpThumbnail(String knExpThumbnail) {
        this.knExpThumbnail = knExpThumbnail;
        return this;
    }

    public String getFIUnderstandingThumbnail() {
        return fIUnderstandingThumbnail;
    }

    public void setFIUnderstandingThumbnail(String fIUnderstandingThumbnail) {
        this.fIUnderstandingThumbnail = fIUnderstandingThumbnail;
    }

    public Lv withFIUnderstandingThumbnail(String fIUnderstandingThumbnail) {
        this.fIUnderstandingThumbnail = fIUnderstandingThumbnail;
        return this;
    }

    public String getExpThumbnail() {
        return expThumbnail;
    }

    public void setExpThumbnail(String expThumbnail) {
        this.expThumbnail = expThumbnail;
    }

    public Lv withExpThumbnail(String expThumbnail) {
        this.expThumbnail = expThumbnail;
        return this;
    }

    public String getFIQuantityThumbnail() {
        return fIQuantityThumbnail;
    }

    public void setFIQuantityThumbnail(String fIQuantityThumbnail) {
        this.fIQuantityThumbnail = fIQuantityThumbnail;
    }

    public Lv withFIQuantityThumbnail(String fIQuantityThumbnail) {
        this.fIQuantityThumbnail = fIQuantityThumbnail;
        return this;
    }

    public String getFIVolumeThumbnail() {
        return fIVolumeThumbnail;
    }

    public void setFIVolumeThumbnail(String fIVolumeThumbnail) {
        this.fIVolumeThumbnail = fIVolumeThumbnail;
    }

    public Lv withFIVolumeThumbnail(String fIVolumeThumbnail) {
        this.fIVolumeThumbnail = fIVolumeThumbnail;
        return this;
    }

    public String getFITAThumbnail() {
        return fITAThumbnail;
    }

    public void setFITAThumbnail(String fITAThumbnail) {
        this.fITAThumbnail = fITAThumbnail;
    }

    public Lv withFITAThumbnail(String fITAThumbnail) {
        this.fITAThumbnail = fITAThumbnail;
        return this;
    }

    public String getKnExpThumbnailSec() {
        return knExpThumbnailSec;
    }

    public void setKnExpThumbnailSec(String knExpThumbnailSec) {
        this.knExpThumbnailSec = knExpThumbnailSec;
    }

    public Lv withKnExpThumbnailSec(String knExpThumbnailSec) {
        this.knExpThumbnailSec = knExpThumbnailSec;
        return this;
    }

    public List<String> getKnExpThumbnailAtb() {
        return knExpThumbnailAtb;
    }

    public void setKnExpThumbnailAtb(List<String> knExpThumbnailAtb) {
        this.knExpThumbnailAtb = knExpThumbnailAtb;
    }

    public Lv withKnExpThumbnailAtb(List<String> knExpThumbnailAtb) {
        this.knExpThumbnailAtb = knExpThumbnailAtb;
        return this;
    }

    public String getFIUnderstThumbSec() {
        return fIUnderstThumbSec;
    }

    public void setFIUnderstThumbSec(String fIUnderstThumbSec) {
        this.fIUnderstThumbSec = fIUnderstThumbSec;
    }

    public Lv withFIUnderstThumbSec(String fIUnderstThumbSec) {
        this.fIUnderstThumbSec = fIUnderstThumbSec;
        return this;
    }

    public List<String> getFIUnderstThumbAtb() {
        return fIUnderstThumbAtb;
    }

    public void setFIUnderstThumbAtb(List<String> fIUnderstThumbAtb) {
        this.fIUnderstThumbAtb = fIUnderstThumbAtb;
    }

    public Lv withFIUnderstThumbAtb(List<String> fIUnderstThumbAtb) {
        this.fIUnderstThumbAtb = fIUnderstThumbAtb;
        return this;
    }

    public String getFIExpThumbSec() {
        return fIExpThumbSec;
    }

    public void setFIExpThumbSec(String fIExpThumbSec) {
        this.fIExpThumbSec = fIExpThumbSec;
    }

    public Lv withFIExpThumbSec(String fIExpThumbSec) {
        this.fIExpThumbSec = fIExpThumbSec;
        return this;
    }

    public List<String> getFIExpThumbAtb() {
        return fIExpThumbAtb;
    }

    public void setFIExpThumbAtb(List<String> fIExpThumbAtb) {
        this.fIExpThumbAtb = fIExpThumbAtb;
    }

    public Lv withFIExpThumbAtb(List<String> fIExpThumbAtb) {
        this.fIExpThumbAtb = fIExpThumbAtb;
        return this;
    }

    public String getFIQuantityThumbnailSec() {
        return fIQuantityThumbnailSec;
    }

    public void setFIQuantityThumbnailSec(String fIQuantityThumbnailSec) {
        this.fIQuantityThumbnailSec = fIQuantityThumbnailSec;
    }

    public Lv withFIQuantityThumbnailSec(String fIQuantityThumbnailSec) {
        this.fIQuantityThumbnailSec = fIQuantityThumbnailSec;
        return this;
    }

    public List<String> getFIQuantityThumbnailAtb() {
        return fIQuantityThumbnailAtb;
    }

    public void setFIQuantityThumbnailAtb(List<String> fIQuantityThumbnailAtb) {
        this.fIQuantityThumbnailAtb = fIQuantityThumbnailAtb;
    }

    public Lv withFIQuantityThumbnailAtb(List<String> fIQuantityThumbnailAtb) {
        this.fIQuantityThumbnailAtb = fIQuantityThumbnailAtb;
        return this;
    }

    public String getFIVolumeThumbnailSec() {
        return fIVolumeThumbnailSec;
    }

    public void setFIVolumeThumbnailSec(String fIVolumeThumbnailSec) {
        this.fIVolumeThumbnailSec = fIVolumeThumbnailSec;
    }

    public Lv withFIVolumeThumbnailSec(String fIVolumeThumbnailSec) {
        this.fIVolumeThumbnailSec = fIVolumeThumbnailSec;
        return this;
    }

    public Fi1 getFi1() {
        return fi1;
    }

    public void setFi1(Fi1 fi1) {
        this.fi1 = fi1;
    }

    public Lv withFi1(Fi1 fi1) {
        this.fi1 = fi1;
        return this;
    }

    public Fi2 getFi2() {
        return fi2;
    }

    public void setFi2(Fi2 fi2) {
        this.fi2 = fi2;
    }

    public Lv withFi2(Fi2 fi2) {
        this.fi2 = fi2;
        return this;
    }

    public Fi3 getFi3() {
        return fi3;
    }

    public void setFi3(Fi3 fi3) {
        this.fi3 = fi3;
    }

    public Lv withFi3(Fi3 fi3) {
        this.fi3 = fi3;
        return this;
    }

    public Fi4 getFi4() {
        return fi4;
    }

    public void setFi4(Fi4 fi4) {
        this.fi4 = fi4;
    }

    public Lv withFi4(Fi4 fi4) {
        this.fi4 = fi4;
        return this;
    }

    public Fi5 getFi5() {
        return fi5;
    }

    public void setFi5(Fi5 fi5) {
        this.fi5 = fi5;
    }

    public Lv withFi5(Fi5 fi5) {
        this.fi5 = fi5;
        return this;
    }

    public Fi6 getFi6() {
        return fi6;
    }

    public void setFi6(Fi6 fi6) {
        this.fi6 = fi6;
    }

    public Lv withFi6(Fi6 fi6) {
        this.fi6 = fi6;
        return this;
    }

    public Fi7 getFi7() {
        return fi7;
    }

    public void setFi7(Fi7 fi7) {
        this.fi7 = fi7;
    }

    public Lv withFi7(Fi7 fi7) {
        this.fi7 = fi7;
        return this;
    }

    public Fi8 getFi8() {
        return fi8;
    }

    public void setFi8(Fi8 fi8) {
        this.fi8 = fi8;
    }

    public Lv withFi8(Fi8 fi8) {
        this.fi8 = fi8;
        return this;
    }

    public Fi9 getFi9() {
        return fi9;
    }

    public void setFi9(Fi9 fi9) {
        this.fi9 = fi9;
    }

    public Lv withFi9(Fi9 fi9) {
        this.fi9 = fi9;
        return this;
    }

    public Fi10 getFi10() {
        return fi10;
    }

    public void setFi10(Fi10 fi10) {
        this.fi10 = fi10;
    }

    public Lv withFi10(Fi10 fi10) {
        this.fi10 = fi10;
        return this;
    }

}
