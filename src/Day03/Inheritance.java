package Day03;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Inheritance {


    public static void main(String[] args) {

        Person p = new Person();
        Person s = new Student(800);
        Student ss = new Student(800);

        s.g();

        Person s1 = new Student(800);


        Person[] people = new Person[100];
        Random rd = new Random();
        for (int i = 0; i < 100; i++) {
            if (rd.nextBoolean())
                people[i] = new Student(i);
            else
                people[i] = new Person();

            people[i] = (rd.nextBoolean()) ? new Student(i) : new Person();

        }

        for (int i = 0; i < 100; i++) {
            if (people[i] instanceof Student)
                System.out.println("index - " + i + " is student");
            else
                System.out.println("index - " + i + " is person");
        }


    }
}
