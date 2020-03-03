//Class Declaration
class Box{
    double width;
    double height;
    double depth;
}
//This Class Declares an object of type Box
public class SimpleClass{
    public static void main(String args[]){
        Box mybox=new Box();    //Creates Object
        double vol;
        //Assign values to mybox's instance variables
        mybox.width=10;
        mybox.height=20;
        mybox.depth=30;
        //Compute Volume
        vol=mybox.width*mybox.height*mybox.depth;
        System.out.println("Volume:"+vol);
    }
}