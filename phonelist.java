import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class phonelist {

	
	public static void main(String[] args)
	{
		
		Scanner scan = new Scanner(System.in);
		
		int cases = scan.nextInt();
		
		main: while(cases --> 0)
		{
			int numbers = scan.nextInt();
			scan.nextLine();
			ArrayList<String> contacts = new ArrayList<>();
			for(int i = 0; i < numbers; i++)
				contacts.add(scan.nextLine());
			
			
			Collections.sort(contacts);
			
			for(int i=0; i < contacts.size()-1; i++)
			{
				if(contacts.get(i+1).startsWith(contacts.get(i)))
				{
					System.out.println("NO");
					continue main;
				}
			}
			
			System.out.println("YES");
			
		}
		
		scan.close();
		
	}

}
