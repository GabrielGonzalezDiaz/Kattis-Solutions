import java.util.Scanner;

public class estimatingtheareaofacircle {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while( scan.hasNext())
		{
			double r = scan.nextDouble();
			double total = scan.nextInt();
			double in = scan.nextInt();
			
			if( r == 0.0 && in == 0 && total == 0 )
			{
				break;
			}
			else
			{
				System.out.print (r * r * Math.PI + " ");
				System.out.println ( (2.0*r)*(2.0*r) * ( in / total) );
			}
		}
		
		scan.close();

	}

}
