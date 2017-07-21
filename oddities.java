import java.util.Scanner;

public class oddities {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int times = scan.nextInt();
		
		while(times > 0){
			int num = scan.nextInt();
			
			if(num % 2 == 0)
			{
				System.out.println(num + " is even");
			}
			else
			{
				System.out.println(num + " is odd");
			}
			
			times--;
		}
		
		scan.close();

	}

}
