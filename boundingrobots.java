import java.util.Scanner;

public class boundingrobots {

	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNext())
		{
			int c = scan.nextInt();
			int r = scan.nextInt();
			if(r == 0 && c == 0)
				break;
			int test = scan.nextInt();
			scan.nextLine();
			//fictional
			int currx = 0;
			int curry = 0;
			
			//actual
			int actx = 0;
			int acty = 0;
			
			while(test --> 0)
			{
				String dir = scan.next();
				int mag = scan.nextInt();
				scan.nextLine();
				if(dir.equals("u"))
				{
					curry += mag;
					if(acty + mag >= r)
						acty = r-1;
					else
						acty += mag;
				}
				if(dir.equals("d"))
				{
					curry -= mag;
					if(acty - mag < 0)
						acty = 0;
					else
						acty -= mag;
				}
				if(dir.equals("r"))
				{
					currx += mag;
					if(actx + mag >= c)
						actx = c-1;
					else
						actx += mag;
				}
				if(dir.equals("l"))
				{
					currx -= mag;
					if(actx - mag < 0)
						actx = 0;
					else
						actx -= mag;
				}
			}
			
			System.out.println("Robot thinks " + currx + " " + curry);
			System.out.println("Actually at " + actx + " " + acty);
			System.out.println();
	
		}

		scan.close();
		
	}

}
