import java.util.Scanner;

public class quickestimate {
	
	public static int numLength(int n)
	{
		if(n == 0) return 1;
		
		else{
		int digs = 0;
		
		while(n>0 ){
			digs++;
			n /= 10;
		}
		
		return digs;
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		for(int i=0; i < n; i++)
		{
			scan.nextLine();
			
			int num = scan.nextInt();
		
			System.out.println(numLength(num));
			
			
		}
		
		scan.close();

	}

}
