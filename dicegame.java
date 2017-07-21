import java.util.Scanner;

public class dicegame {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int g = 0;
		int e = 0;
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		
		g = a + c + a + d + b + c + d + b;
		
		scan.nextLine();
		
		int a0 = scan.nextInt();
		int b0 = scan.nextInt();
		int c0 = scan.nextInt();
		int d0 = scan.nextInt();
		
		e = a0 + c0 + a0 + d0 + b0 + c0 + d0 + b0;
		
		if(g > e) System.out.print("Gunnar");
		else if(e > g) System.out.print("Emma");
		else System.out.print("Tie");
		
		scan.close();
	}

}
