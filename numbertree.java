import java.util.Scanner;

public class numbertree {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int hieght = scan.nextInt();
		
		char[] commands = scan.nextLine().trim().toCharArray();
		
		long index = 0;
		long hi = (long)Math.pow(2, hieght+1)-1;
		
		for(int i=0; i < commands.length; i++){
			if(commands[i] == 'L')
				index = (index * 2) + 1;
			else
				index = (index * 2) + 2;
			}
		
		System.out.println(hi - index);
		
		scan.close();

	}

}
