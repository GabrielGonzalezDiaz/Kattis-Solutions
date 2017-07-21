import java.util.ArrayList;
import java.util.Scanner;

public class dicecup {

	public static void printMatrix(int[][] a){
		
		for(int r = 0; r < a.length; r++)
		{
			for(int c = 0; c < a[0].length; c++)
			{
				System.out.print(a[r][c] + "	");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int d1 = scan.nextInt();
		int d2 = scan.nextInt();
		
		int[][] sum = new int[d1][d2];
		
		for(int r = 0; r < d1; r++)
		{
			int i=2;
			for(int c = 0; c < d2; c++)
			{
				sum[r][c] = r + i;
				i++;
			}
		}
	
		
		
		int[] prob = new int[d1+d2+1];
		
	
		for(int i=0; i < prob.length; i++)
		{
			prob[i] = 0;
		}
		
		
		
		for(int r = 0; r < sum.length; r++)
		{
			for(int c = 0; c < sum[0].length; c++)
			{
				prob[sum[r][c]]++;
			}
		}
		
		/**for(int i=0; i < prob.length; i++)
		{
			System.out.print(prob[i] + " ");
		}*/
		
		ArrayList<Integer> res = new ArrayList<>();
		
		int ind = 0;
		
		for(int i=1; i < prob.length-1; i++)
		{
			if(prob[i] >= prob[i+1])
			{
				ind = i;
				break;
			}
		}
		
		//System.out.println(ind);
		
		for(int i=0; i < prob.length; i++)
		{
			if(prob[i] == prob[ind])
			{
				res.add(i);
			}
		}
		
		for(int i=0; i < res.size(); i++)
		{
			System.out.println(res.get(i));
		}
		
		
		scan.close();
		
		
		
		
	}

}
