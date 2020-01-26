class TestArray{
    public static void main(String args[]){
        int a[]={10,20,30,40,50}; //Initialization
        //Traversing Array
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        //Sum and Average Calculation
        float sum=0,avg; 
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        avg=sum/a.length;
        System.out.println("Sum ="+ sum); //Display Sum
        System.out.println("Average ="+ avg); //Display Average
    }
}