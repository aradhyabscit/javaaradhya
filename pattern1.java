package patternsjava;
import java.util.*;
public class pattern1
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int rows;

        System.out.println("enter rows size ");
        
        rows=s.nextInt();

        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print("*");

            }

            System.out.println();
        }

    }
    
}
