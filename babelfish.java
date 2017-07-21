import java.util.HashMap;
import java.util.Scanner;

public class babelfish {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean dic = true;
		
		HashMap<String, String> dictionary = new HashMap<>();
		
		while (scan.hasNextLine())
		{
			String str = scan.nextLine();
			
			if(str.isEmpty())
			{
				dic = false;
				continue;
			}
			else if(dic)
			{
				int index = str.indexOf(" ");
				String key = str.substring(0, index);
				String def = str.substring(index+1);
				dictionary.put(def, key);
			}
			else
			{
				if(dictionary.containsKey(str))
				{
					System.out.println(dictionary.get(str));
				}
				else
				{
					System.out.println("eh");
				}
			}
		}
		
		scan.close();

	}

}
