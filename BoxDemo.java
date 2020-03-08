class Box{
    double width;
    double height;
    double depth;
    //Constructor for Box when all dimensions are specified
    Box(double w,double h,double d){
        width=w;
        height=h;
        depth=d;
    }
    //Constructor for box whe no parameters
    Box(){
        width=-1;//-1 to indicate a non initialized box
        height=-1;
        depth=-1;
    }
    Box(double len){
        width=height=depth=len;
    }
    //Display Volume of a box
    double vol(){
        return width*height*depth;
    }
}
//This Class Declares an object of type Box
public class BoxDemo{
    public static void main(String args[]){
        Box mybox=new Box(10,15,25);    //Creates Object
        Box mybox2=new Box();
        Box mycube=new Box(7);
        double vol;
        //Compute Volume
        vol=mybox.vol();
        System.out.println("Volume:"+vol);
        vol=mybox2.vol();
        System.out.println("Volume:"+vol);
        vol=mycube.vol();
        System.out.println("Volume:"+vol);
    }
}