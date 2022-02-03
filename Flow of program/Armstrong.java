
import java.util.Scanner;

public class Armstrong {
        public static void main(String args[]) {
            int number,temp,sum=0;
            System.out.println("Enter the number: ");
            Scanner sc=new Scanner(System.in);
            number=sc.nextInt();
            int real=number;
            while(number>0){
                temp=number%10;
                int power=temp*temp*temp;
                sum=power+sum;
                number=number/10;
            }
            if(sum==real){
                System.out.println(real+" is an armstrong number");
            }else{
                System.out.println(real+" is not an armstrong number");
            }
            }
    }
