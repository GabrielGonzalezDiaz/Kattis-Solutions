import java.util.ArrayList;
import java.util.Scanner;

public class carrots {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int contest = scan.nextInt();
		int humPuff = scan.nextInt();
		ArrayList<String> list = new ArrayList<>();
		for(int i=0; i < contest; i++){
			String s = scan.next();
			list.add(s);
		}
		
		System.out.println(humPuff);
		
		scan.close();
		
	}

}
