package Day02;

import java.util.Arrays;
import java.util.Random;

public class Main {


    public static void main(String[] args) {

        Object[] p = new Object[2];
        p[0] = "Barak";
        p[1] = "Sharabi";

        Object[] p1 = new Object[2];
        p[0] = "Barak2";
        p[1] = "Sharabi2";

        Object[][] persons = new Object[2][2];
        persons[0] = p;
        persons[1] = p1;


        StringBuilder s = new StringBuilder();
        Person person = new Person();
        person.name="Barak";
        person.last_name="Sharabi";
        person.age=10;

        Person person1 = new Person("name");
        person.name="Barak";
        person.last_name="Sharabi";
        person1.age=11;

        Person person2 = new Person(12);
        person.print();

        System.out.println(person.toString());


        person.equals(person1);

        Person[] people =new Person[10];
        System.out.println(people[0]);
        for (int i = 0; i < people.length; i++) {
            people[i]= new Person(person);
        }
        people[0].name="fffff";
        System.out.println(Arrays.toString(people));
        people[0].arr[0]=123456;
        System.out.println(Arrays.toString(people));

        int[] arr = {1,2,3,5,6,6,6,9,8,48};
        boolean bool = Search(arr,9);
        Person.printCNT();

    }

    public static boolean Search(int[] arr, int item) {

        return Search(arr,item,new Random().nextInt(arr.length));

    }

    private static boolean Search(int[] arr, int item, int indexStart) {
        for (int i = indexStart; i <arr.length; i++) {
            if(arr[i]==item)
                return true;
        }
        return false;
    }


}
