import java.io.*;
abstract class Fibo1
{
    int n;
    int d;
    int a=0;
    int b=1;
    int c;
    String z=" 0 1 2 3 5 8  " ;
    abstract void Fibonaci();
}
public class Abs_Fibbonacci 
{
    public static void main(String[] args) throws Exception
 {
     Fibo2 obj = new Fibo2();
     obj.Fibonaci();
 }
}
class Fibo2 extends Fibo1
{
    
    void Fibonaci()
    {
        try{
        File file = new File("D:\\Amreen\\input.txt");
         FileReader fin= new FileReader(file);
         while ((n=fin.read())!= -1){
             System.out.println("Fibonacci series upto "+n+" is :-"+z);
             d=n;
             fin.close();
         }
         
      while(c<d)
         {
             System.out.print(c+" ");
             c=a+b;
             a=b;
             b=c;
             
         }
       
         
         
        }catch(IOException e)
        {}
}
}
