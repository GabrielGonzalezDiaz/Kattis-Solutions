import java.util.Scanner;

public class differentdistances {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNextDouble())
		{
			
			double a = scan.nextDouble();
			
			if(a == 0)
				break;
			
			double b = scan.nextDouble();
			double c = scan.nextDouble();
			double d = scan.nextDouble();
			
			double p = scan.nextDouble();
			
			
			System.out.println( Math.pow(Math.pow(Math.abs(a-c), p) + Math.pow(Math.abs(b-d), p), 1/p) );
			
			
		}
		
		scan.close();
		

	}

}
