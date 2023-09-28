
import java.io.IOException;
import java.util.Scanner;

class str{
    public static void main(String args[])
    throws IOException{
        //String str;
        Scanner myobj=new Scanner(System.in);
        String city[]=new String[10];
        System.out.println("enter a city 1 to 5:");
        for(int i=0;i<5;i++){
            city[i]=myobj.nextLine();
        }
         for(int i=0;i<5;i++){
            System.out.println("you enter cites is: "+city[i]+",");
        }
        
        

    }
    }
