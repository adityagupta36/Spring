package LearnConstDI_Basics.Bean;

public class Test {

    private String name;
    private int age;
    private String email;
    private int phno;
    private String city;



    public Test(String name, int age, String email){
        this.name=name;
        this.age=age;
        this.email=email;
    }


        public void Hello(){
        System.out.println("My name is: " + " " + name + " and Age is: " + age + " and email id is: " + email  );
    }




//    <-------------------------->various possibliities<------------------------>
/*
public Test(String name){
    this.name=name;
}
public Test(String name, int age){
    this.name=name;
    this.age=age;
}
public Test(int age){
    this.age = age;
}

    public void newHello(){
        System.out.println("Hello My name is: " + name + " and my age is: " + age);
    }
*/









}
