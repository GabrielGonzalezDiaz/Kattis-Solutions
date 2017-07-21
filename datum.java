import java.util.Scanner;

public class datum {

	public static void cycle(int a)
	{
		if(a == 6)
			a=0;
		else 
			a++;
	}
	
	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);
		
		int day = scan.nextInt();
		int month = scan.nextInt();

		String[] days = {"Monday", "Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		
		int index = 0;
		
		if(month == 1)
			index = 3;
		else if(month == 2)
			index = 6;
		else if(month == 3)
			index = 6;
		else if(month == 4)
			index = 2;
		else if(month == 5)
			index = 4;
		else if(month == 6)
			index = 0;
		else if(month == 7)
			index = 2;
		else if(month == 8)
			index = 5;
		else if(month == 9)
			index = 1;
		else if(month == 10)
			index = 3;
		else if(month == 11)
			index = 6;
		else if(month == 12)
			index = 1;
		
		day--;
		
		while(day --> 0)
		{
			index++;
		}
		
		System.out.println(days[index%7]);
		scan.close();
		
	}

}
