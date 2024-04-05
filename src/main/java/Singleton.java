class A{
    static int i=0;
    private A() {

        System.out.println("Singleton class constructor");
        i++;
        System.out.println(i);

    }

    static A a = new A();

    public static A getInstance(){
        System.out.println("Hey this is singleton class");
        return a;
    }
}
public class Singleton {

    public static void main(String[] args) {

        A a = A.getInstance();
        A a1 = A.getInstance();
        A a2 = A.getInstance();
        A a3 = A.getInstance();
        A a4 = A.getInstance();

        System.out.println(a==a4);




    }
}
