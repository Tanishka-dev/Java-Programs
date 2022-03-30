package Maths;

import java.util.*;

public class Prime{
    public static void main(String[] args) {
        int n;
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        for (int i = 2; i < n; i++) {
            if(n%i==0){
                System.out.println("Not Prime");
                return;

            }
       }
       System.out.println(" Prime");

    }
}