import java.util.Scanner;

class FibonnacciWOR{
    public static void main(String args[]){
        int n1=0,n2=1,number,fib=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        number=sc.nextInt();
        System.out.println("Fibonacci series: "+n1+" "+n2);
        for(int i=2;i<number;i++){
            fib=n1+n2;
            System.out.print(" "+fib+" ");
            n1=n2;
            n2=fib;
      }
        
    }
}