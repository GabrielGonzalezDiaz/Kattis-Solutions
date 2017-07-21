import java.util.Scanner;

public class sumkindofproblem {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int pair = scan.nextInt();
	
		for(int u=0; u < pair; u++)
		{
			int set  = scan.nextInt();
			int num = scan.nextInt();
			
			int pos = 0;
			
			for(int i=1; i <= num; i++)
			{
				pos += i;
			}
			
			int odd = 0;
			
			for(int i=1; i <= num*2; i+=2)
			{
				
				odd += i;
					
			}
			
			int even = 0;
			
			for(int i=0; i <= num*2; i+=2)
			{
				
				even += i;
				
				
			}
			
			System.out.println(set + " " + pos + " " + odd + " " + even);
			scan.nextLine();
		}

		scan.close();
		
	}

}
