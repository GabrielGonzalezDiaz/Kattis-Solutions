import java.util.Scanner;

public class natrij {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String line1 = scan.nextLine();
		String line2 = scan.nextLine();
		
		String[] h1 = line1.split(":");
		String[] h2 = line2.split(":");
	
			
			
		if(Integer.valueOf(h2[0]) <= Integer.valueOf(h1[0]))
			h2[0] = Integer.valueOf(h2[0]) + 24 + "";
		
		int s1 = Integer.valueOf(h1[0]) * 3600 + Integer.valueOf(h1[1]) * 60 + Integer.valueOf(h1[2]);
		int s2 = Integer.valueOf(h2[0]) * 3600 + Integer.valueOf(h2[1]) * 60 + Integer.valueOf(h2[2]);
		
		s2 -= s1;
		
		int h = s2 / 3600;
		s2 %= 3600;
		int m = s2 / 60;
		s2 %= 60;
		int s = s2;
		
		
		if(h < 10)
			System.out.print("0" + h + "");
		else
			System.out.print(h + "");
		System.out.print(":");
		if(m < 10)
			System.out.print("0" + m + "");
		else
			System.out.print(m + "");
		System.out.print(":");
		if(s < 10)
			System.out.print("0" + s + "");
		else
			System.out.print(s + "");
		
		scan.close();

	}

}
