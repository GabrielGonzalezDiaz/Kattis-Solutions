import java.util.Scanner;


public class cold {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int times = scan.nextInt();
		
		int negs = 0;
		
		for(int i=0; i<times; i++){
			int num = scan.nextInt();
			if(num < 0) negs++;
		}

		System.out.println(negs);
		
		scan.close();
		
	}

}
