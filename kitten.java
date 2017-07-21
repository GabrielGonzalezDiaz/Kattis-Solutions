import java.util.HashMap;
import java.util.Scanner;

public class kitten {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String kitten = scan.next();
		scan.nextLine();
		
		HashMap<String, String> tree = new HashMap<>();
		
		while(true)
		{
			
			String s = scan.next();
			
			if(s.equals("-1"))
			{
				break;
			}
			else
			{
				String leaf[] = scan.nextLine().split(" ");
				for(int i=0; i < leaf.length; i++)
					tree.put(leaf[i], s);
			}
			
		}
		
		while(true)
		{
			System.out.print(kitten);
			
			if(!tree.containsKey(kitten))
			{
				break;
			}
			else
			{
				System.out.print(" ");
				kitten = tree.get(kitten);
			}
		}
		
		scan.close();

	}

}
