package hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class hash {
    public static void main(String[] args) {
        // step 1 , take n as a input for size of array and make a array and initialize the values from user

        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter the size of array : ");
        int n = sc.nextInt();
        int [] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.print(" Enter the value in array on index no " + i + " : ");
            arr[i] = sc.nextInt();
        }

        // step 2 , make a hashmap and assign the values in hashmap

        HashMap<Integer,Integer> hash = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int num = arr[i];

            hash.put(num , hash.getOrDefault(num , 0) + 1);
        }

        // step 3 , queries

        System.out.print(" Enter the number of queries : ");
        int q = sc.nextInt();
        while(q-- > 0){
            System.out.print(" Enter the number to get its freq : ");
            int num = sc.nextInt();

            System.out.println(hash.getOrDefault(num , 0));
        }

        // mpp.entrySet() returns a Set of all pairs
        for (HashMap.Entry<Integer, Integer> entry : hash.entrySet()) {
            System.out.println(entry.getKey() + " --> " + entry.getValue() + " times");
        }
    }
}
