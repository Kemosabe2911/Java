import java.util.Scanner;   //To import Scanner class
public class Prime{
    public static void main(String args[]) {
        int n,i,flg=1;
        Scanner s=new Scanner(System.in);          //Object creation
        System.out.println("Enter the Number:"); 
        n=s.nextInt();              //Read data
        for(i=2;i<=n/2;i++){
            if(n%i==0){             //Checking Prime or not
                flg=0;
                break;
            }
        }
        if(flg==1){
            System.out.println("Given Number is prime");
        }
        else{
            System.out.println("Given Number is not prime");
        }
    }
}
