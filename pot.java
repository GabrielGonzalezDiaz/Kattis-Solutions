import java.util.Scanner;

public class pot {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int times = scan.nextInt();
		
		int sum = 0;
		
		for(int u=1; u <= times; u++)
		{
			
			int num = scan.nextInt(); 
			
			int pow = Integer.parseInt(( String.valueOf( num ).substring(String.valueOf(num).length()-1)), 10 );
			num = Integer.parseInt(( String.valueOf(num).substring(0,String.valueOf(num).length()-1)), 10 );
			sum += Math.pow(num, pow);
			
			
		}
		
		System.out.println(sum);
		
		scan.close();
	
	}

}
