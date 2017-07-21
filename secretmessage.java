import java.util.Scanner;

public class secretmessage 
{
	
		public static int nextsq(int n)
		{
			boolean notfound = true;
			while (notfound)
			{
				if(Math.sqrt(n) == (double)((int)Math.sqrt(n)))
				{
					return n;
				}
				else
				{
					n++;
				}
			}
			
			return -1;
		}

		public static void main(String[] args)
		{	
	
		Scanner scan = new Scanner(System.in);
	
		int cases = scan.nextInt();
		scan.nextLine();
	
		while (cases --> 0)
		{
			String str = scan.nextLine();
			
			int size = nextsq(str.length());
			
			String[][] msg = new String[(int)Math.sqrt(size)][(int)Math.sqrt(size)];
			
			int index = 0;
			
			for(int r=0; r < msg.length; r++)
			{
				for(int c=0; c < msg.length; c++)
				{
					if(index > str.length()-1)
						msg[r][c] = "*";
					else
						msg[r][c] = str.substring(index, index+1);
					index++;
				}
			}
			
			String ans = "";
			for(int c=0; c < msg.length; c++)
			{
				for(int r=msg.length-1; r >= 0; r--)
				{			
					if(!msg[r][c].equals("*")) ans += msg[r][c];	
				}
			}
			System.out.println(ans);
			
		}
		
		scan.close();
	
	}
}


