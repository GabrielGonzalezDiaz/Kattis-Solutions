

import java.util.ArrayList;
import java.util.Scanner;



public class permutedarithmeticsequence {

	static ArrayList<String> results = new ArrayList<>();
	
	public static void SelectionSort(int[] a){
		
		for(int i=0; i < a.length-1; i++) {
			int mindex=i;
			for(int j=i+1; j<a.length; j++){
			 if(a[j] < a[mindex])
			mindex = j;
			}
			if(mindex != i) {
			 int t = a[i];
			 a[i] = a[mindex];
			 a[mindex]= t;
			}
			 }

	}
	
	public static void resolve(int[] list){
		
		
		int len = list.length;
		
		
		for(int i=0; i < len-2; i++){
			if(!(list[i+1]-list[i] == list[i+2] - list[i+1])){
				break;
			}else if(i == len-3){
				results.add("arithmetic");
				return;
			}
		}	
		
		SelectionSort(list);
		
		
		for(int i=0; i < len-2; i++){
			if(!(list[i+1]-list[i] == list[i+2] - list[i+1])){
				break;
			}else if(i == len-3){
				results.add("permuted arithmetic");
				return;
			}
			
		}
		
		results.add("non-arithmetic");
		
	
	}
	
	public static void main(String[] args) {
		
		
		
		Scanner scan = new Scanner(System.in);
		
		int lines = scan.nextInt();
		
		for(int j=0; j<lines; j++){
			int times =  scan.nextInt();
			int[] nums = new int[times];
			for(int i=0; i < times; i++){
				nums[i] = scan.nextInt();
			}
			resolve(nums);
		}
		
		for(int i=0; i<results.size(); i++){
			System.out.println(results.get(i));
		}
		
		scan.close();
	}
}

