package Functions;

import java.util.Scanner;

public class PythoTriplet {
    public static void main(String[] args) {
        int n1,n2,n3;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        n1=sc.nextInt();
        System.out.println("Enter the second number: ");
        n2=sc.nextInt();
        System.out.println("Enter the largest number: ");
        n3=sc.nextInt();
        
        tripletCheck(n1,n2,n3);
    }

    public static void tripletCheck(int n1, int n2, int n3) {
        int h=n3*n3;
        int sumOfSq=(n1*n1)+(n2*n2);
        if(sumOfSq==h)
            System.out.println(n1+","+n2+","+n3+" is a Pythagorean triplet");
        else 
            System.out.println(n1+","+n2+","+n3+" is not a Pythagorean triplet");

    }
}
