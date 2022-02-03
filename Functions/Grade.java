package Functions;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        int marks;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter marks obtained: ");
        marks=sc.nextInt();
        gradeCheck(marks);

        }
        static void gradeCheck(int marks){
            if(marks<=40)
                System.out.println("Grade: Fail");
            else if(marks<=50)
                System.out.println("Grade: DD");
            else if(marks<=60)
                System.out.println("Grade: CC");
            else if(marks<=70)
                System.out.println("Grade: BC");
            else if(marks<=80)
                System.out.println("Grade: BB");
            else if(marks<=90)
                System.out.println("Grade: AB");
            else if(marks<=100)
                System.out.println("Grade: AA");

        }
}
