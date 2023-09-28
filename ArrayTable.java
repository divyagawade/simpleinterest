public class ArrayTable 
{
    public static void main(String []args)
    {
        //creation of array
        int d[][]=new int[30][40];
        System.out.println("Multiplication of table");
        //System.out.println("_____");

        for(int i=10;i<20;i++)  //i=10      //i=11............i=19
        {
            for(int j=10;j<20;j++)  //j=10   //j=11,j=12......j=19.....j=10
            {
                d[i][j]=i*j;
                System.out.println(" "+d[i][j]);
            }
        }
        System.out.println(" ");
    }
    
}
