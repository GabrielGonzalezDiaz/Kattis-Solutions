import java.util.Scanner;

public class honey {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] nums = {-1 , 0, 6, 12, 90, 360, 2040, 10080, 54810, 290640, 1588356, 8676360, 47977776, 266378112, 1488801600};

		int cases = scan.nextInt();

		while (cases --> 0)
			System.out.println(nums[scan.nextInt()]);

		scan.close();
		
	}

}
