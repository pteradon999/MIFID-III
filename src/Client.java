public class Client extends Person{
    public String Company_Name;
    public String Reg_Num;
    public String Reg_country;
    public String Pars_pam;
    public String c_type;

    public String getCompany_Name() {
        return Company_Name;
    }

    public String getC_type() {
        return c_type;
    }

    public void setC_type(String c_type) {
        this.c_type = c_type;
    }

    public void setCompany_Name(String company_Name) {
        Company_Name = company_Name;
    }

    public String getReg_Num() {
        return Reg_Num;
    }

    public void setReg_Num(String reg_Num) {
        Reg_Num = reg_Num;
    }

    public String getReg_country() {
        return Reg_country;
    }

    public void setReg_country(String reg_country) {
        Reg_country = reg_country;
    }

    public String getPars_pam() {
        return Pars_pam;
    }

    public void setPars_pam(String pars_pam) {
        Pars_pam = pars_pam;
    }
}
