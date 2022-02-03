import java.util.Scanner;

class SimpleInterest{
    public static void main(String args[]){
        double p=5,r=65,t=0, sim=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter principle ");
        p= sc.nextDouble();
        System.out.println("Enter Rate ");
        r= sc.nextDouble();
        System.out.println("Enter Time ");
        t= sc.nextDouble();
        sim=(p*r*t)/100;

        System.out.println("Simple Interest for principle "+p+" rate "+r+ " time "+t+ " is: "+sim);

        
    }
}