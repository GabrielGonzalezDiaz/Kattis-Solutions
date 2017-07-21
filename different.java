import java.math.BigInteger;
import java.util.Scanner;

public class different {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNextBigInteger())
		{
		
		BigInteger a = scan.nextBigInteger();
		
		BigInteger b = scan.nextBigInteger();
		
		BigInteger c = a.subtract(b);
		
		c = c.abs();
		
		System.out.println(c);
		
		
		scan.close();
		
				
		}
		
	}

}
