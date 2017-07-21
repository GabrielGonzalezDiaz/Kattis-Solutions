import java.util.Scanner;

public class easiest {

	public static int sumDigits(int n)
	{
		if(n < 10) return n;
		
		else return n % 10 + sumDigits(n/10);
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while(true)
		{
			int n = scan.nextInt();
			
			if(n == 0) break;
			else {
				
				int num = 11;
				
				int res = 0;
				
				while(true)
				{
					if(sumDigits(n) == sumDigits(n * num))
					{
						res = num;
						break;
					}
					else
					{
						num++;
					}
				}
				
				System.out.println(res);
			}
		}
		
		scan.close();
			
	}

}
