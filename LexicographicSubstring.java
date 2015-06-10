/*
Solution Author: @tannamiren
Problem Statement:
Today we will learn about java strings. Your task is simple, given a string, find out the lexicographically 
smallest and largest substring of length k.
[Note: Lexicographic order is also known as alphabetic order dictionary order. So "ball" is smaller than "cat", 
"dog" is smaller than "dorm". Capital letter always comes before smaller letter, so "Happy" is smaller than 
"happy" and "Zoo" is smaller than "ball".]

Input Format:
First line will consist a string containing english alphabets which has at most 1000 characters. 2nd line 
will consist an integer k.

Output Format:
In the first line print the lexicographically minimum substring. In the second line print the lexicographically 
maximum substring.

Sample Input:
welcometojava
3
Sample Output:
ava
wel
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LexicographicSubstring {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        String testString="";
            testString= in.nextLine();
        int testStringLength=testString.length();
        if(testStringLength<=0 || testStringLength>1000)
            System.out.println("invalid length");
            else{
        if(!testString.matches("[a-zA-Z]+"))
            System.out.println("invalid String input");
            else {
        int k= in.nextInt();
        if(k<=0 || k>testStringLength)
            System.out.println("invalid substring length");
        else{
        int j=0;
        TreeSet<String> testStringSet= new TreeSet<String>();
        while(j+k<=testStringLength){
            testStringSet.add(testString.substring(j, j+k));
            j++;
        }
        System.out.println(testStringSet.first());
        System.out.println(testStringSet.last());                
        }
            }
           }
    }
}
