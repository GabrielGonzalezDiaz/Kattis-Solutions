import java.util.ArrayList;
import java.util.Scanner;

public class bookingaroom {

	public static void main(String[] args)
	{
	
		Scanner scan = new Scanner(System.in);
		
		int rooms = scan.nextInt();
		int booked = scan.nextInt();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=0; i < booked; i++)
		{
			list.add(scan.nextInt());
		}
		
		if(rooms <= booked) 
		{
			System.out.println("too late");
		}
		else
		{
			for(int i=1; i <= rooms; i++)
			{
				if(!list.contains(i))
				{
					System.out.println(i);
					break;
				}
			}
		}

		scan.close();
		
	}

}
