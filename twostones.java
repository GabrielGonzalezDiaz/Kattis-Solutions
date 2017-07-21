import java.util.Scanner;

public class twostones {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		if(num % 2 == 1)
		{
			System.out.print("Alice");
		}
		else
		{
			System.out.print("Bob");
		}

		scan.close();
		
	}

}
