// How to read and print an integer number in java.

import java.util.Scanner;

public class Day_One{
    public static void main(String args[]) 
      {
        int numOne;
        System.out.print("Enter a Number :");
        Scanner sc1 =new Scanner(System.in);
        numOne = sc1.nextInt();
        System.out.println("Your enterted number is " + numOne);
      }
}
//--------------------------------------End----------------------------------------

Java Program to multiply two floating point numbers.

 
public class Day_One {

    public static void main(String[] args) {

        float numOne = 12.0f;
        float numTwo  =12.5f;
        float numMultiply;
        numMultiply = numOne*numTwo;
        System.out.println("Multiply two floating point number "+ numMultiply);
    }
}
//--------------------------------------End---------------------------------------------
// Java program to swap to number 

// Approach 1: Using Third varible 

   public class Day_One {

     public static void main(String[] args) {
              int numOne = 20 ;
              int numTwo = 25 ;
              int tempContainer;
        System.out.println("Before swapping two number: " + numOne + " " + numTwo);
              tempContainer = numOne ;
              numOne = numTwo ;
              numTwo = tempContainer ;
        System.out.println("After swpping two number: " + numOne + " " + numTwo );

     }
}


// Approach 2 :- Using two varible 

 public class Day_One {

    public static void main(String[] args) {
        int numOne = 20 ;
        int numTwo = 25 ;
        System.out.println("Before swapping two number: " + numOne + " " + numTwo);
        numOne = numOne + numTwo ;
        numTwo = numOne - numTwo ;
        numOne = numOne - numTwo ;
        System.out.println("After swapping two number: " + numOne + " " + numTwo);
    }
}


// Approach 3 :-  Using arithmetic operators

public class Day_One {

    public static void main(String[] args) {
        int numOne = 20 ;
        int numTwo = 25 ;
        System.out.println("Before swapping two number: " + numOne + " " + numTwo);
        numOne = (numOne + numTwo) -(numTwo = numOne);
        System.out.println("After swapping two number: " + numOne + " " + numTwo);

    }
} 
//-------------------------------------End--------------------------------------------------