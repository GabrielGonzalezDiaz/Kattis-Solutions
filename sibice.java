import java.util.ArrayList;
import java.util.Scanner;

public class sibice 
{

	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);
		
		int matches = scan.nextInt();
		double l = scan.nextInt();
		double w = scan.nextInt();
		
		scan.nextLine();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		while(matches --> 0)
		{
			list.add(scan.nextInt());
			scan.nextLine();
		}
		
		
		for(int i : list)
		{
			if(i <= Math.sqrt(l*l+w*w))
			{
				System.out.println("DA");
			}
			else
			{
				System.out.println("NE");
			}
		}
		scan.close();

	}

}
