import java.util.ArrayList;
import java.util.Scanner;

public class everywhere {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int times = scan.nextInt();
		
		for(int u=0; u < times; u++)
		{
			
			int cities = scan.nextInt();
			
			scan.nextLine();
			
			ArrayList<String> log = new ArrayList<>();
			
			for(int i=0; i < cities; i++)
			{
				String str = scan.nextLine();
				if(!log.contains(str))
				{
					log.add(str);
				}
			}
			
			System.out.println(log.size());
			
		}
		
		scan.close();

	}

}
