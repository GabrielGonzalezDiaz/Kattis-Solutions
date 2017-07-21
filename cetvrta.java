import java.util.Scanner;

public class cetvrta {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int x1 = scan.nextInt();
		int y1 = scan.nextInt();

		int x2 = scan.nextInt();
		int y2 = scan.nextInt();

		int x3 = scan.nextInt();
		int y3 = scan.nextInt();
		
		int x4 = 0;
		int y4 = 0;
		
		if(x1 == x2) x4 = x3;
		else if(x1 == x3) x4 = x2;
		else x4 = x1;
		
		if(y1 == y2) y4 = y3;
		else if(y1 == y3) y4 = y2;
		else y4 = y1;

		System.out.print(x4 + " "+ y4);
		
		scan.close();
		
	}

}
