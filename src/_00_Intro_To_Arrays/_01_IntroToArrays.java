package _00_Intro_To_Arrays;

import java.util.Random;

public class _01_IntroToArrays {
    public static void main(String[] args) {
        // 1. declare and Initialize an array 5 Strings
String yeah[]= new String[5];
yeah[0]="q";
yeah[1]="w";
yeah[2]="e";
yeah[3]="r";
yeah[4]="t";
        // 2. print the third element in the array
System.out.println(yeah[2]);
        // 3. set the third element to a different value
yeah[2]="ee";
        // 4. print the third element again
System.out.println(yeah[2]);
        // 5. use a for loop to set all the elements in the array to a string
        //    of your choice

        // 6. use a for loop to print all the values in the array
        //    BE SURE TO USE THE ARRAY'S length VARIABLE
for (int i = 0; i < 5; i++) {
	System.out.println(yeah[i]);
} 
        // 7. make an array of 50 integers
for (int i = 0; i < 50; i++) {
int[] bro = {i};	
}

        // 8. use a for loop to make every value of the integer array a random
        //    number

	Random ran = new Random(50);
//	 bro[]= {}ran;

        // 9. without printing the entire array, print only the smallest number
        //    on the array

        // 10 print the entire array to see if step 8 was correct

        // 11. print the largest number in the array.

        // 12. print only the last element in the array

    }
}
