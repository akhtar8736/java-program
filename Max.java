import java.util.Scanner;
class Max
{
public static void main( String  args[])
{
    int a;
    int b;
    int max;
    Scanner sc = new Scanner (System.in);
    System.out.println("enter the first num");
    a= sc.nextInt();
    System.out.println("enter the second num");
    b= sc.nextInt();
   
    sc.close();

    if(a>b)
    {
        max=a;
    
    }
    else 
    {
        max=b;

    }
 System.out.println("max num is:" +max);
}
}