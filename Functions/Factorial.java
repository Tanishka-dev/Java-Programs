package Functions;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int number;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        number=sc.nextInt();
        
        A a= new A();
        a.factorial(number);
      }  
}

class A{
    public void factorial(int n) {
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;   
        }   
        System.out.println("Factorial of "+n+" is "+fact);    
    }

    public void tripletCheck(int n1, int n2, int n3) {
    }
}
