//For a value of n=3
//Display an output like:
//32*
//3*1
//*21

import java.util.Scanner; //Import Scanner class
public class Code2{  
    public static void main(String []args){  
           int i,j,lines;
           Scanner s=new Scanner(System.in);
           System.out.println("Enter no of lines:");
           lines=s.nextInt(); 
           System.out.println("Output:"); 
      for(i=1;i<=lines;i++){// this loop is used to print the lines  
         for(j=lines;j>=1;j--){// this loop is used to print numbers in a line  
             if(j!=i)  
              System.out.print(j);  
              else  
               System.out.print("*");  
      }  
      System.out.println("");  
      }  
       }} 