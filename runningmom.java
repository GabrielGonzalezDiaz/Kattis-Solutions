import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class runningmom {

	/**public boolean DFS( city city, city target, Stack<city> path, boolean first, HashSet<city> visited ){
		if( city.equals( target ) && !first )
			return true;

		}**/
	
	public static boolean safe(city city){
		ArrayList< city > q = new ArrayList< city >();
		HashSet< city > visited = new HashSet< city >();
		q.add( city );
		while( !q.isEmpty() ){
			city curr = q.remove(0);
			visited.add(curr);
			
			for( city c : curr.nbgrs ){
				if( c.equals(city) ){
					return true;
					}
				if(!visited.contains(c))
					q.add(c);
				}
			
			}
		return false;
		}
	
	public static boolean BFS(city city){
		ArrayList< city > q = new ArrayList< city >();
		HashSet< city > visited = new HashSet< city >();
		q.add( city );
		while( !q.isEmpty() ){
			city curr = q.remove(0);
			visited.add(curr);
			
			for( city c : curr.nbgrs ){
				if( visited.contains( c ) ){
					//System.out.println(c);
					if(safe(c))
						return true;
					}
				q.add(c);
				}
			
			}
		return false;
		}
	
	public static void main( String[] args ){
		
		Scanner scan = new Scanner( System.in );
		
		int flights = scan.nextInt();
		scan.nextLine();
		
		HashMap< String, city > map = new HashMap< String, city >();
		
		for( int i=0; i < flights; i++ ){
			String c1 = scan.next();
			String c2 = scan.nextLine().trim();
			
			if( !map.keySet().contains( c1 ) )
				map.put( c1, new city( c1 ) );
			
			if( !map.keySet().contains( c2 ) )
				map.put( c2, new city( c2 ) );
			
			map.get( c1 ).addnbgrs( map.get( c2 ) );
			}
		
		while( scan.hasNextLine() ){
			String c = scan.nextLine();
			city city = map.get( c );
			System.out.println(BFS(city)? c + " safe" : c + " trapped");
			}
		
		scan.close();

	}

}

class city implements Comparable<city>{
	String name;
	HashSet< city > nbgrs = new HashSet< city >();
	public city( String n ){
		name = n;
		}
	public void addnbgrs( city a ){
		nbgrs.add( a );
		}
	public String toString(){
		return name;
		}
	
	public int compareTo(city c) {
		return this.name.compareTo(c.name);
		}
	
	public boolean equals(city c){
		return this.name.equals(c.name);
		}
}
