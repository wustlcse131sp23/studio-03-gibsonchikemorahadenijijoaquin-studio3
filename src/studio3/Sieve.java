package studio3;

import java.util.Scanner;

public class Sieve {
	
	 public static void main(String[] args)
	   {
	   
		 Scanner in = new Scanner(System.in);
		  
		 System.out.println("Give me a Number?");
		 int n = in.nextInt();  //The number being sieve // if the number is less than
		 boolean array [] = new boolean [n + 1];
		 
		 for (int i = 1; i < array.length; i ++) //Sets array to true
		 {
			 array[i] = true;
		 }
		
		 for (int j = 2; j < array.length/2; j ++ ) // Go through the array, insuring its not a multiple of 2
		 { 
			 for (int k = j * 2 ; k < array.length; k += j)  // This is skipping over multiples of 2    
			{
				array[k] = false;
			} 
		 }
		 for (int l = 0; l < array.length; l ++)
		 { 
			 if (array[l])
			 {
				System.out.println(l);
			 }
		 }
		 
		 
		 
		 
	   }
}
