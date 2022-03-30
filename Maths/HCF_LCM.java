package Maths;

import java.util.Scanner;

public class HCF_LCM{
    public static void main(String[] args) {
        int hcf=1,lcm=0,max=0,other=0;
        System.out.println("Enter two nos.");
        Scanner scn= new Scanner(System.in);
        int num1=scn.nextInt();
        int num2=scn.nextInt(); 
        if(num1>num2){
            max=num1;
            other=num2;
        }else{
            max=num2;
            other=num1;
        }
           
        for (int i = 2; i < max; i++) {
            if(max%i==0 && other%i==0)
                hcf=i;         
        }

        lcm=(num1*num2)/hcf;
        System.out.println("hcf: "+hcf);
        System.out.println("lcm: "+lcm);
    }
    
    
}