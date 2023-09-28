import java.util.Scanner;

public class simpleinterest {
    public static void main(String args[]){
        int principl,ri,t;
        System.out.println("enter a principl, rate of interst,time peroid:  ");
        Scanner myobj=new Scanner(System.in);
        principl=myobj.nextInt();
        ri=myobj.nextInt();
        t=myobj.nextInt();
        int si=(principl*ri*t)/100;
        System.out.println("simple intrest is :"+si);

    }
    
}
