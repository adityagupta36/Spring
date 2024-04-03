package SI_DI_UndefaultCollections.bean;

import java.util.*;

public class Test {

    private Vector fruits;
    private TreeSet cricketers;
    private Hashtable countries_cap;

    public void setFruits(Vector fruits){
        this.fruits=fruits;
    }
    public void setCricketers(TreeSet cricketers){
        this.cricketers=cricketers;
    }
    public void setCountries_cap(Hashtable countries_cap){
        this.countries_cap=countries_cap;
    }

    @Override
    public String toString() {
        return "Test{" +
                "fruits=" + fruits +
                ", cricketers=" + cricketers +
                ", countries_cap=" + countries_cap +
                '}';
    }

    public void printData(){

        for (Object o1:fruits){
            System.out.println(o1);
        }

        System.out.println("***************************************");

        for (Object o2:cricketers){
            System.out.println(o2);
        }

        System.out.println("*****************Approach 1***********************");
        System.out.println(countries_cap);


        Set s = countries_cap.keySet();
        for (Object o3:s){
            System.out.println(o3 + " ==>" + countries_cap.get(o3));
        }



    }


}
