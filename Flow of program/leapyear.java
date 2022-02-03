class leapyear{
    public static void main(String args[]){
        int year=2044;
        if(year%400==0){
            System.out.println(year+" Year is a leap year");
        }else if(year%4==0 && year%100!=0){
            System.out.println(year+" year is a leap year");
        }else{
            System.out.println(year+" is not a leap year");
        }
        
    }
}