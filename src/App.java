import java.util.Scanner;

/*
Name: john muema michael
Course cosc 2436 2801
Date 2/7/2020

Assignment Description 
A palindrome is a group of characters that read the same forward or backwards.  The goal of this assignment is to 
write a recursive method that detects whether the String parameter is receives is a palindrome or not.  The method 
should 
be a boolean-returning method called isPalindrome.
The program package should be called palindromes.*/
public class App {
    /*The getuserImput gets the a string from user*/
    static void getuserInput() {
        //create a scanner object
        Scanner pali = new Scanner(System.in);
    System.out.println("please enter a string, and we will check if its a palindrome for you.");


        String UserTyped=pali.nextLine();
        //convert user input to char array
        char UserInputChar[]=UserTyped.toCharArray();
        int size=UserTyped.length();
        char reversedUserInput[]=new char[size];
        int i=0;
        while (i!=size) { 
            reversedUserInput[size-1-i]=UserInputChar[i];
            ++i;   
        }
        i=0;
        while(i!=size){
            if (UserInputChar[i]!=reversedUserInput[i]) {
                System.out.println(UserTyped +" is not palindrome");
                System.exit(0);
                
            }
            else{
                ++i;
                continue;
            }
        }
        
        System.out.println(UserTyped +  " is a palindrome " );


       
    }
    
	public static void main(String[] args) throws Exception {
      //calling a method that gets user input and checks weither what user enters is palindrome

getuserInput();

    
}
}