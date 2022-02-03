class Hcflcm{
    public static void main(String args[]){
        int a=5,b=65,hcf=0, lcm=0;
        for(int i=2;i<=a;i++){
            if(a%i==0 && a%i==0){
                hcf=i;
            }
        }
        System.out.println(hcf);
        lcm=(a*b)/hcf;
        System.out.println("LCM of "+a+" and "+b+" is: "+lcm);
        System.out.println("HCF of "+a+" and "+b+" is: "+hcf);

        
    }
}