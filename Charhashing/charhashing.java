package Charhashing;

import java.util.Scanner;

public class charhashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter the String : ");
        String x = sc.nextLine();

        //making hash for string
        int [] hash = new int[26];

        for (int i = 0; i < x.length(); i++) {
            char ch = x.charAt(i);
            // 2. Check if it's a lowercase letter
            if (ch >= 'a' && ch <= 'z') {
                // Subtracting 'a' (97) gives us indices 0 to 25
                hash[ch - 'a'] += 1;
            }
        }

        // queries

        System.out.print(" Enter no. of queries : ");
        int q = sc.nextInt();
        while(q-- > 0){
            System.out.print(" Enter the char to find : ");
            char str = sc.next().charAt(0);
            if(str >= 'a' && str <= 'z' ){
                System.out.println(hash[str-'a']);
            }
            else{
                System.out.println(" INVALID");
            }
        }

    }
}
