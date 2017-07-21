import java.util.ArrayList;
import java.util.Scanner;

public class busnumber {

	public static void solve(int[] a){
		
		SelectionSort(a);
		ArrayList<String> list = new ArrayList<>();
		for(int i=0; i<a.length; i++){
			list.add(a[i] + "");
		}
		
		for(int i=1; i<list.size()-1; i++){
			if(a[i] + 1 == a[i+1] && a[i] - 1 == a[i-1]){
				list.set(i, "-");
			}
		}
		
		
		
		for(int i=0; i < list.size()-1; i++){
			if(list.get(i).equals("-")){
				System.out.print("-");
				while(list.get(i+1).equals("-")){
					i++;
				}
			}
			else if(list.get(i+1).equals("-")) System.out.print(list.get(i));
			else System.out.print(list.get(i) + " ");
		}
		
		System.out.print(list.get(list.size()-1));
	
		
	
		
	}

		
	
	public static void SelectionSort(int[] a){
		for(int i=0; i < a.length-1; i++) {
			int mindex=i;
			for(int j=i+1; j<a.length; j++){
			 if(a[j] < a[mindex]) mindex = j;
			}
			if(mindex != i) {
			 int t = a[i];
			 a[i] = a[mindex];
			 a[mindex]= t;
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int times = scan.nextInt();
		int[] nums = new int[times];
		
		for(int i=0; i<times; i++){
			nums[i] = scan.nextInt();
		}
		
		if(times == 1) System.out.print(nums[0]);
		else{
			solve(nums);
		}
		
		scan.close();
		
		
	}

}
