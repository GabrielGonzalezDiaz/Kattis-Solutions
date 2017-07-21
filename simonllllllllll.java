import java.util.Scanner;

public class simonllllllllll {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int times = scan.nextInt();
		
		
		for(int i=0; i < times+1; i++)
		{
			String s = scan.nextLine();
			
			if(s.length() < 11)
			{
				System.out.println();
			}
			else if(s.startsWith("simon says"))
			{
				System.out.println(s.substring(11));
			}
			else{
				System.out.println();
			}
			
		}
		
		scan.close();
		
		
	}

}
