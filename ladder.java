import java.util.Scanner;

public class ladder {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double height = scan.nextDouble();
		double angle = scan.nextDouble();
		
		System.out.print((int)(height/Math.sin(Math.toRadians(angle))) + 1);
		
		scan.close();

	}

}
