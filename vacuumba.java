import java.util.Scanner;

public class vacuumba {

	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		int cases = scan.nextInt();
				
		while( cases --> 0 ){
			
			double x = 0.0;
			double y = 0.0;
			double angle = 0;
			
			int moves = scan.nextInt();
			
			while( moves --> 0 ){
				angle += scan.nextDouble();
				angle %= 360;
				double dist = scan.nextDouble();
				x += Math.cos(Math.toRadians(angle)) * dist;
				y += Math.sin(Math.toRadians(angle)) * dist;
				}
			
			System.out.printf("%.8f" , -y);
			System.out.print(" ");
			System.out.printf("%.8f" , x);
			System.out.println();
			
			}
		
		scan.close();

		}

	}
