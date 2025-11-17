import java.util.*;
import java.lang.*;
class scnr
{
    public static void main()
    {
        Scanner o=new Scanner(System.in);
        System.out.println("Enter function");
        System.out.println("+  \t  -  \t   /  \t   * ");
        char func=o.nextLine().charAt(0);
        System.out.println("Enter first number");
        double num1=o.nextDouble();
        System.out.println("Enter first number");
        double num2=o.nextDouble();
        
        if(func=='+')
        {
            double z=num1 + num2;
            System.out.println(z);
        }
        else if(func=='-')
        {
            double z=num1 - num2;
            System.out.println(z);
        }
        else if(func=='/')
        {
            double z=num1 / num2;
            System.out.println(z);
        }
        else if(func=='*')
        {
            double z=num1 * num2;
            System.out.println(z);
        }
        else
        {
            
        } 
        
    }
}