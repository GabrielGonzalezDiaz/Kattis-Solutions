import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class letter implements Comparable<letter>{
	int occ = 0;
	String l;
	public letter(String l){
		this.l = l;
		}
	
	void addOcc(){
		occ++;
		}

	public int compareTo(letter o) {
		return this.occ - o.occ;
		}
	public boolean equals(letter o){
		return this.l.equals(o.l);
		}
	
	}

public class simplicity {
	
	public static int sim(String line){
		ArrayList<String> letters = new ArrayList<>();
			
		int counter = 0;
	  
		for(int i=0; i < line.length(); i++){
			if(!letters.contains(line.substring(i,i+1))){
				counter++;
				letters.add(line.substring(i,i+1));
	    		}
			}
		
		return counter;
		
	}
	
	public static int getind(letter l, ArrayList<letter> list){
		for(letter let : list)
			if(let.l.equals(l.l))
				return list.indexOf(let);
		return -1;
	}
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		String line = scan.nextLine();
		 
		if(sim(line) < 3)
			System.out.println("0");
		else{
			ArrayList<String> used = new ArrayList<>();
			ArrayList<letter> letters = new ArrayList<>(); 
			
			int intlen = line.length();
			
			for(int i=0; i < line.length(); i++)
				{
				String let = line.substring(i, i+1);
				if(!used.contains(let)){
					letters.add(new letter(let));
					used.add(let);
					}
				else{
					letters.get(getind(new letter(let), letters)).addOcc();
					}
				}
			
			Collections.sort(letters);
			
			while(sim(line) >= 3){
				line = line.replaceAll(letters.get(0).l, "");
				letters.remove(0);
				}
			
			System.out.println(intlen - line.length());
			
			}

		scan.close();
		
		}

	}
