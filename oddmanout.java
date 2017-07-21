import java.util.ArrayList;
import java.util.Scanner;

public class oddmanout {

	public static boolean repeated(int a, ArrayList<Integer> b)
	{
		int counter = 0;
		
		for(int i=0; i < b.size(); i++)
		{
			if(b.get(i) == a) counter++;
		}
		
		return counter > 1;
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int cases = scan.nextInt();
		
		scan.nextLine();
		
		for(int j=0; j < cases; j++)
		{
			int people = scan.nextInt();
			
			scan.nextLine();
			
			ArrayList<Integer> guest = new ArrayList<>(people);
			
			for(int i=0; i < people; i++)
			{
				guest.add(scan.nextInt());
			}
			
			for(int i=0; i < people; i++)
			{
				if(!repeated(guest.get(i), guest))
				{
					System.out.println("Case #" + (j+1) + ": " + guest.get(i));
				}
			}
			
			
			scan.nextLine();
			
		}
		
		scan.close();

	}

}
