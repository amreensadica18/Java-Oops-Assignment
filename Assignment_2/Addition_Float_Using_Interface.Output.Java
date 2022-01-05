interface Addfloat
{
    public void add();
}
public class Addition_Float_Using_Interface implements Addfloat
{
    public void add()
    {
        float a=18.0f;
        float b=24.0f;
        System.out.println(a+b);
    }
    public static void main(String args[])
    {
    	Addition_Float_Using_Interface obj= new Addition_Float_Using_Interface();
       obj.add();
    }
    
}
