import java.lang.*;
class a2DArray{
    public static void main(final String args[]) {
        final int a[][] = new int[3][4]; //Array Declaration
        int i,j;
        for(i=0;i<3;i++)
         for(j=0;j<4;j++)
          a[i][j]=i*j; //Data Insertion
        for(i=0;i<3;i++){
            for(j=0;j<4;j++){
                System.out.print(a[i][j]+" "); //Printing The 2D Array
            }
            System.out.println();
        }  
    }
}