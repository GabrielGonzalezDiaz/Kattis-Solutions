import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;


class snode 
{
	public String id;
	public HashSet<snode> adj = new HashSet<>();
	public ArrayList<snode> par = new ArrayList<>();

	
	public snode(String id)
	{
		this.id = id;
	}
	
	public String toString()
	{
		return id;
	}
		
}

public class torn2pieces {


	public static ArrayList<snode> BFS(snode s, snode end)
	{
		HashSet<snode> visited = new HashSet<>();
		ArrayList<snode> path = new ArrayList<>();
		ArrayList<snode> q = new ArrayList<>();
		
		q.add(s);
		
		while(!q.isEmpty())
		{
			snode n = q.remove(0);
			if(visited.contains(n))
			{
				continue;
			}
			else if(n.equals(end))
			{
				path.add(n);
				if(n.par.isEmpty())
					return path;
				
				while(!n.par.isEmpty())
				{
					path.add(n.par.get(0));
					n=n.par.get(0);
				}
				return path;
			}
			else
			{
				visited.add(n);
				for(snode j : n.adj)
				{
					if(!visited.contains(j))
					{
						j.par.add(n);
						q.add(j);
					}
				}
			}
		}
		
		return null;
	}

	
	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);
		
		int stations = scan.nextInt();
		
		scan.nextLine();
		
		String[] lines = new String[stations];
		HashMap<String, snode> nodes = new HashMap<>(); 
		snode[] snodes = new snode[stations];
		
		for(int i=0; i < stations; i++)
		{
			String str = scan.nextLine();
			lines[i] = str;
			snodes[i] =	new snode(str.substring(0,str.indexOf(" ")));
			nodes.put(str.substring(0,str.indexOf(" ")), snodes[i]);
		}
		
		for(int i=0; i < lines.length; i++)
		{
			String str = lines[i].substring(lines[i].indexOf(" ") + 1);
			String[] ns = str.split(" ");
			for(int j = 0; j < ns.length; j++)
			{
				if(!nodes.containsKey(ns[j]))
				{
					nodes.put(ns[j], new snode(ns[j]));
				}
				snodes[i].adj.add(nodes.get(ns[j]));
				nodes.get(ns[j]).adj.add(snodes[i]);
			}
		}
		
		for(int i=0; i < snodes.length; i++)
		{
			snodes[i].adj = new HashSet<>(snodes[i].adj);
		}
		
		String s = scan.next();
		String e = scan.next();
		snode start;
		snode end;
		if(nodes.containsKey(s) && nodes.containsKey(e))
		{
			start = nodes.get(s);
			end = nodes.get(e);
	
			ArrayList<snode> path = BFS(start, end);
			
			if(path == null)
			{
				System.out.println("no route found");
			}
			else
			{
				for(int i = path.size()-1; i >=0; i--)
					System.out.print(path.get(i) + " ");
			}
		}
		else
		{
			System.out.println("no route found");
		}
		scan.close();
		
	}

}