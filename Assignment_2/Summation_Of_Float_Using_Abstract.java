abstract class ClassA1 {
   abstract void addtion();
}
public class Summation_Of_Float_Using_Abstract extends ClassA1 {
    public void addtion()
    {
        float a=18.1234567f;
        float b=24.1234567f;
        System.out.println(a+b);
    }
    public static void main(String args[])
    {
    	Summation_Of_Float_Using_Abstract obj=new Summation_Of_Float_Using_Abstract();
        obj.addtion();
    }
}
