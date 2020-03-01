import java.util.Scanner;
public class Code1  
{  
    public static void main(String args[]) 
    { 
        int n,e;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter n:");
        n=s.nextInt();
        System.out.println("Enter e:");
        e=s.nextInt(); 
        System.out.println("Output:");
        System.out.println((int)(Math.log(n) / Math.log(e))); 
    } 
} 