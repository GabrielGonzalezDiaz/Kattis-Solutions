import java.util.Scanner;

public class faktor {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double a = scan.nextInt();
		double b = scan.nextInt();
		
		b--;
		
		System.out.println((int)(a * b + 1));

		scan.close();
		
	}

}
