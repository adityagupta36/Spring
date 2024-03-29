package Sett_DI_Array_of_SecondaryDataType.Bean;

import java.util.Arrays;
import java.util.Iterator;

public class Company {

    private String companyname;

    private Employees [] employees;

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public void setEmployees(Employees[] employees) {
        this.employees = employees;
    }

    public void getCompanyDetails(){
        System.out.println("Company name is: " + companyname);

        for (int i =0; i<employees.length ; i++){
            System.out.println(employees[i]);
        }

/*        Iterator <Employees> itr = Arrays.stream(employees).iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }*/
    }

}
