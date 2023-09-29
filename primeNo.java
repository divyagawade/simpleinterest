import java.util.Scanner;

public class primeNo
{
    public static void main(String args[])
    {
        Scanner myobj=new Scanner(System.in);
        int num;
        System.out.println("Enter a number:-");
        num=myobj.nextInt();
        if(num%2==0||num%3==0||num%7==0)
        {
            System.out.println("Number is not prime");
        }else{
            System.out.println("Number is prime");
        }

        myobj.close();
    }
}    


