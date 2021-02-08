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
    static char[] getuserInput() {

        String UserTyped="eve";
        //convert user input to char array
        char UserInputChar[]=UserTyped.toCharArray();
        int size=UserTyped.length();
        char reversedUserInput[]=new char[size];
        int i=0;
        while (i!=size) { 
            reversedUserInput[size-1-i]=UserInputChar[i];
            ++i;   
        }
        
        System.out.println("Please enter a word, we will check if its a palindrome");
        System.out.println(UserTyped );
        System.out.println(reversedUserInput);
    
        return reversedUserInput;
       
    }
    
	public static void main(String[] args) throws Exception {
      /*
       *call the input method  */ 

getuserInput();




    
}
}