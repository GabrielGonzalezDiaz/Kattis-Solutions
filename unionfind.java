import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class unionfind {

	static int[] id;
	
	public static int getroot(int i){
		while(i != id[i]){
			id[i] = id[id[i]];
			i = id[i];
			}
		return i;
		/**int id = i;
		while(id != id[id])
			id = id[id];
		
		while(i != id){
			int next = id[i];
			id[i] = id;
			i = next;
			}
		return id;*/
		}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
		String[] first = in.readLine().split(" ");
		int num = Integer.valueOf(first[0]);
		int commands = Integer.valueOf(first[1]);
		int[] rank = new int[num];//size
		id = new int[num];
		
		for(int i=0; i < num; i++){
			id[i] = i;
			rank[i] = 1;
			}
		
		while( commands --> 0 ){
			String[] line = in.readLine().split(" ");
			int a = Integer.valueOf(line[1]);
			int b = Integer.valueOf(line[2]);
			if(line[0].equals( "?" )){
				if(getroot(a)==getroot(b))
					out.println("yes");
				else
					out.println("no");
				}
			else{
				int i = getroot(a);
				int j = getroot(b);
				if(i == j)
					continue;
				/**if(rank[i] < rank[j])
					id[i] = j;
			    else if (rank[i] > rank[j])
			    	id[j] = i;
			    else{
			    	id[j] = i;
			        rank[i] = rank[i] + 1;
			    	}**/
				if(rank[i] < rank[j]){id[i] = j; rank[j] += rank[i];}
				else{id[j] = i; rank[i] += rank[j];}
				}
			}
		
		in.close();
		out.close();

		}

	}
