//Method Overloading
class OverloadDemo{
    //No parameter
    void test(){
        System.out.println("No parameters");
    }
    //One parameter
    void test(int a){
        System.out.println("a:"+a);
    }
    //Two Parameters
    void test(int a,int b){
        System.out.println("a & b :"+a+" "+b);
    }
    //Double Parameter
    Double test(Double a){
        System.out.println("Double a:"+a);
        return a*a;
    }
}
public class Overload{
    public static void main(String args[]){
        OverloadDemo ob= new OverloadDemo();
        double result;
        //Call all versions of test
        ob.test();
        ob.test(10);
        ob.test(10,20);
        result=ob.test(123.2);
        System.out.println("Result:"+result);
    }
}