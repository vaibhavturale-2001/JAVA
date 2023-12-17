package Array.Array_Interview_Que;

import java.util.Scanner;

public class TwoInput_ByUser {
    /*
    * Taking two input by user of an array
    * of size 10 and add do the sum of add in third
    * */
    public static void main(String[] args) {
        int[] a=new int[10];
        int[] b=new int[10];
        int[] c=new int[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr input of a");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enetr input of b");
        for(int i=0;i<b.length;i++){
            b[i]=sc.nextInt();
        }
        for(int i=0;i<c.length;i++){
            c[i]=a[i]+b[i];
            System.out.println(c[i]);
        }

    }

}
