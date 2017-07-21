import java.util.ArrayList;
import java.util.Scanner;

public class blackfriday {

	public static int notRepeated(int a, ArrayList<Integer> b)
	{
		int counter = 0;
		
		for(int i=0; i < b.size(); i++)
		{
			if(b.get(i) == a) counter++;
		}
		
		//System.out.println(counter);
		
		return counter;
		
		
		
		
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int players = scan.nextInt();
		
		scan.nextLine();
		
		ArrayList<Integer> die = new ArrayList<>();
		
		for(int i=0; i < players; i++)
		{
			int n = scan.nextInt();
			die.add(n);
		}
		
		boolean found = false;
	
		for(int i=6; i >= 1; i--)
		{
			if(notRepeated(i, die) == 1)
			{
				System.out.println(die.indexOf(i) + 1);
				found = true;
				break;
			}
		}
		
		if(!found)
		{
			System.out.println("none");
		}
		
		scan.close();

	}

}
