import java.util.Scanner;

public class conditionalExample
{
public static void main(String [] args)
{
Scanner sc = new Scanner(System.in);

System.out.println("Enter the interger value");
int n = sc.nextInt();

if(n > 0)
{
    if( n % 2 == 1)
    System.out.println("It is weird");
    else if(n % 2 == 0 && n >= 2 && n <=5)
    {
        System.out.println("It is not weird");
    }
    else if(n % 2 == 0 && n > 5 && n <= 20)
    System.out.println("It is Weird");
    else if(n % 2 == 0 && n > 20)
    System.out.println("It is NOT Weird");
}
}
}