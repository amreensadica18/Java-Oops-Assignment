class Addfloat
{
  float a=18.0f;
  float b=24.0f;
}
public class Addition_of_float extends Addfloat
{
    float add=a+b;
    public static void main(String args[])
    {
        Addition_of_float obj= new Addition_of_float();
        System.out.print("Addittion of float:"+obj.add);
    }
    
}
