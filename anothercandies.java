import java.math.BigInteger;
import java.util.Scanner;

public class anothercandies 
{
    
    public static void main(String[] args) 
    {
        
        Scanner scan = new Scanner(System.in);
        
        int cases = scan.nextInt();
       
        while(cases --> 0)
        	{
        	int kids = scan.nextInt();
        	BigInteger sum = BigInteger.ZERO;
        	for(int i=0; i < kids; i++)
        		{
        		sum = sum.add(BigInteger.valueOf(scan.nextLong()));
        		}
        	
        	if(sum.mod(BigInteger.valueOf(kids)).equals(BigInteger.ZERO))
        		System.out.println("YES");
        	else
        		System.out.println("NO");
        	
        	}
        
        
        scan.close();
        
    }

}