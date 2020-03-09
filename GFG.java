import java.io.*; 
import java.lang.Math; 
import java.util.Scanner;

class GFG 
{ 
	static int maxGCD(int N, int K) 
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
        N=s.nextInt();
        K=s.nextInt();
		System.out.println(maxGCD(N, K)); 
	} 
} 

