// Prime number
public class Day_Three {
    public static void main(String[] args) {
       int  Year = 2023;
        if((Year%400==0)||(Year%4==0 && Year%100!=0))
        {
            System.out.println(Year + " is leap year");
        }
        else{
            System.out.println(Year + " is not leap");
        }
    }
}
    
//---------------------------------End-----------------------------------------
//Find factorial number using java
public class Day_Three {
    public static void main(String[] args) 
    {
        int num = 6 ;
        int res = 1 ;
        for(int i = 2; num>=i;i++)
           { 
            res*=i;      
           }
            System.out.println(num + "  factorial is " + res);
    }
}
//----------------------------------End-------------------------------------------
    // Fibonacci Series Numbers
    public class Day_Three {
    
        public static void main(String[] args) {
            int n1= 0 , n2 =1 , sum = 0;
             for(int i =2 ; i<10;i++){
                sum = n1+n2;
                System.out.print(" " + sum);
                n1=n2;
                n2=sum;
             }
        }
    }
//---------------------------------End------------------------------------------------