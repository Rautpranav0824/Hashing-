package Problem_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class hash {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int [] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.print(" Enter the value for the index no. " + i + " : ");
            arr[i]= sc.nextInt();
        }

        // hashmap

        HashMap<Integer,Integer> mpp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int num = arr[i];
            mpp.put(num , mpp.getOrDefault(num ,0) +1);
        }

        //mpp.entrySet() — gives you all key-value pairs in the map as a set. Each entry holds one pair.

        int maxFreq = 0;
        int maxNum = -1;
        for (HashMap.Entry<Integer,Integer> entry : mpp.entrySet()){
            int num = entry.getKey();
            int freq = entry.getValue();

            if(freq > maxFreq){
                maxNum = num ;
                maxFreq = freq ;
            }
        }
        System.out.println(" The max number to occur is : " + maxNum + " and it appered : "+maxFreq+ " times ");

    }
}
