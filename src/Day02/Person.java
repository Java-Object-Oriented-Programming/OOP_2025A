package Day02;

import java.util.Arrays;

public class Person {
    private static int CNT =0;

    protected String name;
    public String last_name;
    protected int age;
    protected int[] arr = {1, 2, 3, 4};
    final double pi=3.14;
    final int mode;


    public Person() {
        this.mode=0;
        CNT++;
    }

    public Person(Person other) {
        this.name = other.name;
        this.last_name = other.last_name;
        this.arr = other.arr;
        this.arr = Arrays.copyOf(other.arr, arr.length);
        this.mode=1;
        CNT++;
        // כאשר משתמשים בהעתקת מערכים של מחלקת Arrays בעצם מבצעים את מה שכתבנו למטה.
//        int[] temp = new int[other.arr.length];
//        for (int i = 0; i < other.arr.length; i++) {
//            temp[i]=other.arr[i];
//        }
//        this.arr= temp;
    }

    public Person(String name) {
        this.name = name;
        this.mode=2;
        CNT++;

    }


    public Person(String name, String last_name) {
        this.name = name;
        this.mode=3;
        CNT++;

    }


    public Person(int age) {
        this.age = age;
        this.mode=4;
        CNT++;

    }

    public void print() {
        CNT++;
        System.out.println("name -> " + name + " " + " last name -> " + last_name);
    }

    @Override
    public boolean equals(Object obj) {
        return age == ((Person) obj).age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", age=" + age +
                ", arr=" + Arrays.toString(arr) +
                '}' + super.toString();
    }

    static void defMode(Person[] people){

        for (int i = 0; i < people.length; i++) {

        System.out.println(people[i].mode);
        }


    }


    static void printCNT(){
        System.out.println(CNT);
    }
}
