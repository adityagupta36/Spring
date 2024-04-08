package SI_DI_Collections.bean;

import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class Test {

    private List fruits;
    private Set cricketers;
    private Map countries_cap;

    public void setFruits(List fruits){
        this.fruits=fruits;
    }
    public void setCricketers(Set cricketers){
        this.cricketers=cricketers;
    }
    public void setCountries_cap(Map countries_cap){
        this.countries_cap=countries_cap;
    }

    @Override
    public String toString() {
        return "Car{" +
                "fruits=" + fruits +
                ", cricketers=" + cricketers +
                ", countries_cap=" + countries_cap +
                '}';
    }

    public void printData(){

        System.out.println(fruits);

        System.out.println("***************************************");

        System.out.println(cricketers);

        System.out.println("*****************Approach 1***********************");


//        Approach 1
        System.out.println(countries_cap);


        Set s = countries_cap.keySet();
        for (Object o:s){
            System.out.println(o + " ==>" + countries_cap.get(o));
        }
        System.out.println("***********************Approach 2******************************");

//        Approach 2
        Set set = countries_cap.entrySet();
        Iterator i = set.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

        System.out.println("********************Approach 3*********************************");

//                Approach 3
        Set ss = countries_cap.entrySet();
        Iterator itr = ss.iterator();
        while (itr.hasNext()){
            Map.Entry entry = (Map.Entry)itr.next();
            System.out.println(entry.getKey() + "==>" + entry.getValue());
        }




    }


}
