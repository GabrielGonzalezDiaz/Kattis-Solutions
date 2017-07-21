import java.util.ArrayList;
import java.util.Scanner;

public class quickbrownfox {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int sen = scan.nextInt();
		scan.nextLine();
		
		for(int k=0; k < sen; k++)
		{
			String str = scan.nextLine();
			
			str = str.toLowerCase();
			
			ArrayList<String> abc = new ArrayList<>();
			
			abc.add("a");
			abc.add("b");
			abc.add("c");
			abc.add("d");
			abc.add("e");
			abc.add("f");
			abc.add("g");
			abc.add("h");
			abc.add("i");
			abc.add("j");
			abc.add("k");
			abc.add("l");
			abc.add("m");
			abc.add("n");
			abc.add("o");
			abc.add("p");
			abc.add("q");
			abc.add("r");
			abc.add("s");
			abc.add("t");
			abc.add("u");
			abc.add("v");
			abc.add("w");
			abc.add("x");
			abc.add("y");
			abc.add("z");
			
			for(int i=0; i < str.length(); i++)
			{
				if(abc.contains(str.substring(i, i+1)))
				{
					abc.remove(str.substring(i, i+1));
				}
			}
			
			if(abc.size() == 0)
			{
				System.out.println("pangram");
			}
			else
			{
				System.out.print("Missing ");
				for(int i=0; i < abc.size(); i++)
				{
					System.out.print(abc.get(i));
				}
				System.out.println();
			}
		}
		
		scan.close();
	}

}
