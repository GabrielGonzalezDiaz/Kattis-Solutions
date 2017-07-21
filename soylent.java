import java.util.Scanner;

public class soylent {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int times = scan.nextInt();
		
		for(int i=0; i < times; i++)
		{
			int cal = scan.nextInt();
			
			if(cal % 400 == 0)
			{
				System.out.print(cal / 400);
			}
			else
			{
				System.out.print((cal / 400) + 1);
			}
		}
		
		scan.close();

	}

}
