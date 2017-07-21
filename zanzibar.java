

import java.util.ArrayList;
import java.util.Scanner;

public class zanzibar {

	public static int refs(ArrayList<Integer> list){
		int refs = 0;
		
		for(int i=0; i < list.size()-1; i++){
			if(list.get(i) * 2 < list.get(i+1)){
				refs += (list.get(i+1) - list.get(i) * 2);
			}else{
				continue;
			}
		}
		
		return refs;
		
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int times = scan.nextInt();
		
		for(int i=0; i < times; i++){
			ArrayList<Integer> list = new ArrayList<Integer>();
			while(scan.hasNextInt()){
				int num = scan.nextInt();
				if(num == 0) break;
				else list.add(num);
			}
			System.out.println(refs(list));
		}
		
		scan.close();

	}

}
