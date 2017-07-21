import java.util.ArrayList;
import java.util.Scanner;

public class tarifa 
{

	public static void main(String[] args)
	{
		
		Scanner scan = new Scanner(System.in);
		
		int monthly = scan.nextInt();
		scan.nextLine();
		int months = scan.nextInt();
		scan.nextLine();
		ArrayList<Integer> usage = new ArrayList<Integer>();
		while(months --> 0)
		{
			usage.add(scan.nextInt());
			scan.nextLine();
		}
		
		int data = 0;
		
		for(int i=0; i < usage.size(); i++)
		{
			data += monthly;
			data-= usage.get(i);
		}
		
		data += monthly;
		
		System.out.println(data);
		
		scan.close();
		
	}

}
