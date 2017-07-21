import java.util.Scanner;

public class pizza2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double r = scan.nextDouble();
		double c = scan.nextDouble();
		
		System.out.println( ( (r-c) * (r-c) / (r * r)) * 100 );

		
		scan.close();
	}

}
