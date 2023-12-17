package Collection.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        ArrayList<String> al1=new ArrayList<>();

//        al.add(10);
//        al.add(20);
//        al1.add("Vaibhav");
//        al1.add("abc");
//        System.out.println(al);
//        System.out.println(al1);
//        System.out.println(al.get(1));
//        System.out.println(al1.get(0));

//        --------------------ORRR----------------
        for (int i=0;i<5;i++){
            Scanner sc=new Scanner(System.in);
            al.add(sc.nextInt());
        }
//        for (int i=0;i<5;i++){
            System.out.println(al);
//        }
    }
}
