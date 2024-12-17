package Day03;

public class Person {

    protected String name;
    protected int age;

    public Person() {

        System.out.println("Constructor from person");
    }
    public final void g(){
        System.out.println("Hello g from person");
    }

    public int f(double a) {
        System.out.println("ff");
        return 1;
    }

    public int getF(double a){

        return f(a);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
