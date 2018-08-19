package array;

import java.util.Scanner;

public class UserArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] num = new int[11];
        System.out.println("Plz enters numbers: ");

        for (int i=0; i<num.length; i++){
            //System.out.println("Plz enters numbers: ");
            num[i]=sc.nextInt();
        }
        for( int j =0; j <num.length; j++){
            num[j]=sc.nextInt();
        }

        System.out.println("Array index value of 10: "+num[10]);

    }

}
