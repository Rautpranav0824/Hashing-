package hashing;

import java.util.Scanner;

public class hash {
    public static void main(String[] args) {
        int n ; // size of the array
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter size of the array : ");
        n= sc.nextInt();
        int [] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the element in array on index no. " + i + " : ");
            arr[i] = sc.nextInt();
        }

        int [] hash = new int[13];

        for (int i = 0; i < n; i++) {
            if(arr[i]<13){
                hash[arr[i]] += 1;
            }
        }

        //fetch
        System.out.print(" Enter number of queries you have to ask : ");
        int q = sc.nextInt();

        while(q-- > 0){
            System.out.print(" Enter the number you want to check : ");
            int num = sc.nextInt();

            if(num < 13 ){
                System.out.println(hash[num]);
            }
            else {
                System.out.println("0");
            }
        }

    }
}
