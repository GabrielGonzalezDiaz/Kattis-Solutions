import java.util.Scanner;

public class grassseed {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		double price = scan.nextDouble();
		
		int lawns = scan.nextInt();
		
		double sqrtFeet = 0;
		
		for(int i=0; i < lawns; i++)
		{
			double len = scan.nextDouble();
			double wid = scan.nextDouble();
			
			sqrtFeet += len * wid;
		}
		
		System.out.print(sqrtFeet * price);
		
		scan.close();

	}

}
