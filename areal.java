import java.util.Scanner;

public class areal {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double area = scan.nextDouble();
		
		System.out.println(Math.sqrt(area) * 4);
		
		scan.close();

	}

}
