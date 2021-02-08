import java.util.Scanner;

/*
Name  john muema michael
Course  cosc 2436 2801
Date 2/7/2020

Assignment Description 
A palindrome is a group of characters that read the same forward or backwards.  The goal of this assignment is to 
write a recursive method that detects whether the String parameter is receives is a palindrome or not.  The method 
should 
be a boolean-returning method called isPalindrome.
The program package should be called palindromes.*/
public class App {
    /*The getuserImput gets the a string from user*/
    static String getuserImput() {

        String UserTyped="trick";
        
        int stringlength=UserTyped.length();
    
        /*extract the data from @ userTyped to 
        a character array called reversedUserImput*/
        char reversedUserImput[stringlength]=UserTyped.toCharArray();


        System.out.println("Please enter a word, we will check if its a palindrme");

        return UserTyped;
       
    }
    

	
	public static void main(String[] args) throws Exception {
       // Create an array of strings to test.

getuserImput();




    
}
}