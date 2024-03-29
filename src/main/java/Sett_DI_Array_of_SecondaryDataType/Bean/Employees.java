package Sett_DI_Array_of_SecondaryDataType.Bean;

public class Employees {

    private String empname;
    private int empage;
    private String sector;

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public int getEmpage() {
        return empage;
    }

    public void setEmpage(int empage) {
        this.empage = empage;
    }

    public String getSector() {
        return sector;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "empname='" + empname + '\'' +
                ", empage=" + empage +
                ", sector='" + sector + '\'' +
                '}';
    }

    public void setSector(String sector) {
        this.sector = sector;
    }
}
