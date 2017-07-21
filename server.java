import java.util.Scanner;

public class server {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int tasks = scan.nextInt();
		int time = scan.nextInt();
		boolean stop = false;
		int counter = 0;
		
		while(tasks --> 0)
		{
			if(!stop)
			{
				int current = scan.nextInt();
				if(current <= time)
				{
					counter++;
					time -= current;
				}
				else
				{
					stop = true;
				}
			}
			
		}
		
		System.out.println(counter);
		
		scan.close();

	}

}
