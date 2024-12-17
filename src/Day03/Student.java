package Day03;

public class Student extends Person {

    private int grade;
    private String name;

    public Student(int grade) {
        System.out.println("Constructor from Student");
        this.grade = grade;
        this.name="dd";


    }

//    public void g(){
//        System.out.println("Hello g from Student");
//
//    }
    private void f(int a){
        System.out.println("f");
    }



}
