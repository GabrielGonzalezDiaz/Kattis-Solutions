import java.util.Scanner;

public class planina {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int it = scan.nextInt();
		
		int start = 3;
		
		int count = 1;;
		
		while(it -- > 1)
		{
			start = start + (start / 2 + count);
			count+= count;
		}
		
		System.out.println(start*start);
		
		scan.close();
		
	}

}
