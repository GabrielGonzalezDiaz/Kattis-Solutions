import java.util.Scanner;

public class pet {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int c1 = 0;
		int c2 = 0;
		int c3 = 0;
		int c4 = 0;
		int c5 = 0;
		
		String p1 = scan.nextLine();
		String p2 = scan.nextLine();
		String p3 = scan.nextLine();
		String p4 = scan.nextLine();
		String p5 = scan.nextLine();
		
		for(int i=0; i < p1.length(); i+=2)
		{
			c1 += Integer.valueOf(p1.substring(i,i+1));
		}
		
		for(int i=0; i < p2.length(); i+=2)
		{
			c2 += Integer.valueOf(p2.substring(i,i+1));
		}
		
		for(int i=0; i < p3.length(); i+=2)
		{
			c3 += Integer.valueOf(p3.substring(i,i+1));
		}
		
		for(int i=0; i < p4.length(); i+=2)
		{
			c4 += Integer.valueOf(p4.substring(i,i+1));
		}
		
		for(int i=0; i < p5.length(); i+=2)
		{
			c5 += Integer.valueOf(p5.substring(i,i+1));
		}
		
		int greatest = Math.max(c1, Math.max(c2, Math.max(c3, Math.max(c4, c5))));
		
		if(greatest == c1) System.out.print((1 + " ") + (c1 + ""));
		if(greatest == c2) System.out.print((2 + " ") + (c2 + ""));
		if(greatest == c3) System.out.print((3 + " ") + (c3 + ""));
		if(greatest == c4) System.out.print((4 + " ") + (c4 + ""));
		if(greatest == c5) System.out.print((5 + " ") + (c5 + ""));
 
		scan.close();
		
	}

}
