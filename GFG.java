/*
Java code to find the logarithm of a number accoeding to the base
*/
import java.io.*; 
import java.lang.Math;   //Import Math class
import java.util.Scanner; //Import Scanner class

class GFG 
{ 
	static int maxGCD(int N, int K)  //Method maxGCD
	{  
		int minSum = (K * (K + 1)) / 2;  
		if (N < minSum) 
			return -1;  
		int i = (int) Math.sqrt(N); 
		int res = 1; 
		while (i >= 1) 
		{ 
			if (N % i == 0) 
			{ 
				if (i >= minSum) 
					res = Math.max(res, N / i); 

				if (N / i >= minSum) 
					res = Math.max(res, i); 
            } 
            else{
                res=-1;
            }
			i--; 
		} 

		return res; 
	} 
	public static void main (String[] args) 
	{
        int N,K;
		Scanner s= new Scanner(System.in); 
		System.out.println("Enter the value of N:");
		N=s.nextInt();
		System.out.println("Enter the value of base");
        K=s.nextInt();
		System.out.println("Output:"+ maxGCD(N, K)); 
	} 
} 

