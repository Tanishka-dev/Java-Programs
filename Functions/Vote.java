package Functions;
import java.util.Scanner;

public class Vote {
    public static void main(String args[]) {
        int age;
        System.out.println("Enter the age: ");
        Scanner sc=new Scanner(System.in);
        age=sc.nextInt();
        voteCheck(age);     
    }
    static void voteCheck(int age){
        if(age>=18){
            System.out.println("You're elligible to vote ");
        }else{
            System.out.println("You're not elligible to vote ");
        }

    }
}
