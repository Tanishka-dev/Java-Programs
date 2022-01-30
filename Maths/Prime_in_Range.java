import java.util.Scanner;

public class Prime_in_Range {
    public static void main(String[] args) {
        int a, b;
        Scanner sc= new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        if (a <= 2) {
            a = 2;
            if (b >= 2) {
               System.out.print(a+ "");
                a++;
            }
        }
     
        if (a % 2 == 0)
            a++;
        for (int i = a; i <= b; i = i + 2) {
            int flag = 1;
            for (int j = 2; j * j <= i; ++j) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }
     
            // flag = 1 means i is prime
            // and flag = 0 means i is not prime
           
            if (flag == 1){
              if(i==1)
                continue;
              else
              System.out.print(i+ " ");
            }
    }
}
}
