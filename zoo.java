import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class zoo {

	public static void main(String[] args)
	{
		
		Scanner scan = new Scanner(System.in);
		
		int c = 0;
		
		while(scan.hasNext())
		{
			int n = scan.nextInt();
			scan.nextLine();
			if(n == 0)
			{
				break;
			}
			else
			{
				System.out.println("List " + (c + 1) + ":");
				ArrayList<String> animals = new ArrayList<>();
				for(int i=0; i < n; i++)
				{
					String str = scan.nextLine();
					String[] last = str.split(" ");
					animals.add(last[last.length-1].toLowerCase());
				}
				
				Collections.sort(animals);
				
				while(animals.size() > 0)
				{
					String name = animals.get(0);
					int counter = animals.lastIndexOf(name) + 1;
					for(int i=0; i < counter; i++)
						animals.remove(0);
					System.out.println(name + " | " + counter);
				}
				c++;
			}
		}
		
		scan.close();

	}

}
