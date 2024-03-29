package LearnSetterDI_Basics.Bean;

public class Test {

    private String gender;
    private int age;
    private String location;

    public void setGender(String gender){
        this.gender=gender;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setLocation(String location){
        this.location=location;
    }

    public void Hello(String person_name){
        System.out.println("Hello" + " location is " + location+ " " + person_name + " age is " + age + " gender is " + gender);
    }

}
