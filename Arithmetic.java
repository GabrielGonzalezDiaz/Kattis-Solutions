import java.math.BigInteger;
import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String XD = scan.nextLine();
		BigInteger num = new BigInteger(XD,8);
		String str = num.toString(16);
		System.out.println(str.toUpperCase());
		scan.close();
	
	}
}
