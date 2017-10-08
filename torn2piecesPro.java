import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;


class TornNode {
	public String id;
	public HashSet<TornNode> adj = new HashSet<>();
	int rank = -1;

	public TornNode(String id){
		this.id = id;
		}
	
	public String toString(){
		return id;
		}	
	}

public class torn2piecesPro {


	public static ArrayList<TornNode> BFS(TornNode s, TornNode end){
		HashSet<TornNode> visited = new HashSet<>();
		ArrayList<TornNode> path = new ArrayList<>();
		ArrayList<TornNode> q = new ArrayList<>();
		s.rank = 0;
		q.add(s);
		
		
		while(!q.isEmpty()){
			TornNode n = q.remove(0);
			if(visited.contains(n)){
				continue;
				}
			else if(n.equals(end)){
				while(true){
					if(n.rank == 0){
						path.add(n);
						break;
						}
					else{
						loop : for(TornNode j : n.adj)
							if(j.rank == n.rank - 1){
								path.add(n);
								n = j;
								break loop;
								}
						}
					}
				return path;
				}
			else{
				visited.add(n);
				for(TornNode j : n.adj){
					if(!visited.contains(j) && j.rank == -1){
						j.rank = n.rank + 1;;
						q.add(j);
						}
					}
				}
			}
		
		return null;
		}

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int stations = scan.nextInt();
		
		scan.nextLine();
		
		String[] lines = new String[stations];
		HashMap<String, TornNode> nodes = new HashMap<>(); 
		TornNode[] TornNodes = new TornNode[stations];
		
		for(int i=0; i < stations; i++){
			String str = scan.nextLine();
			lines[i] = str;
			TornNodes[i] =	new TornNode(str.substring(0,str.indexOf(" ")));
			nodes.put(str.substring(0,str.indexOf(" ")), TornNodes[i]);
			}
		
		for(int i=0; i < lines.length; i++){
			String str = lines[i].substring(lines[i].indexOf(" ") + 1);
			String[] ns = str.split(" ");
			for(int j = 0; j < ns.length; j++){
				if(!nodes.containsKey(ns[j])){
					nodes.put(ns[j], new TornNode(ns[j]));
					}
				TornNodes[i].adj.add(nodes.get(ns[j]));
				nodes.get(ns[j]).adj.add(TornNodes[i]);
				}
			}
		
		for(int i=0; i < TornNodes.length; i++){
			TornNodes[i].adj = new HashSet<>(TornNodes[i].adj);
			}
		
		String s = scan.next();
		String e = scan.next();
		TornNode start;
		TornNode end;
		if(nodes.containsKey(s) && nodes.containsKey(e)){
			start = nodes.get(s);
			end = nodes.get(e);
	
			ArrayList<TornNode> path = BFS(start, end);
			
			if(path == null){
				System.out.println("no route found");
				}
			else{
				for(int i = path.size()-1; i >=0; i--)
					System.out.print(path.get(i) + " ");
				}
			}
		else{
			System.out.println("no route found");
			}
		scan.close();
		
	}

}
