package GraphTheory;

public class Dijextra {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dijextra D=new Dijextra();
		int[][]graph=new int[][]{{0, 4, 0, 0, 0, 0, 0, 8, 0},
            					{4, 0, 8, 0, 0, 0, 0, 11, 0},
            					{0, 8, 0, 7, 0, 4, 0, 0, 2},
            					{0, 0, 7, 0, 9, 14, 0, 0, 0},
            					{0, 0, 0, 9, 0, 10, 0, 0, 0},
            					{0, 0, 4, 14, 10, 0, 2, 0, 0},
            					{0, 0, 0, 0, 0, 2, 0, 1, 6},
            					{8, 11, 0, 0, 0, 0, 1, 0, 7},
            					{0, 0, 2, 0, 0, 0, 6, 7, 0}
								};
		D.ShortestPath (graph,1,graph[0].length);

	}

	public void ShortestPath(int[][] graph, int source, int length) {
		// TODO Auto-generated method stub
		int[]dist=new int[length];
		boolean []visited = new boolean [length];
		for(int i=0;i<length;i++){
			dist[i]=Integer.MAX_VALUE;
			visited[i]=false;
		}
		dist[source]=0;
		for(int i=0;i<length-1;i++){
			int node_u=minimumDist(dist,visited);
			if(node_u!=-1){
			visited[node_u]=true;
			for(int node_v=0;node_v<length;node_v++){
				if(!visited[node_v]&&graph[node_u][node_v] !=0&& dist[node_u]+graph[node_u][node_v]<dist[node_v])
					dist[node_v]=dist[node_u]+graph[node_u][node_v];
				}
			}}
	print(dist,source);	
	}

	private void print(int []dist,int source){
		System.out.println("Shortest path from source "+source +" to all nodes: ");
		for(int i=0;i<dist.length;i++){
			System.out.println(i+"\t\t\t"+dist[i]);
		}
	}
	private int minimumDist(int[] dist, boolean[] visited) {
		// TODO Auto-generated method stub
		int min=Integer.MAX_VALUE;
		int min_index=-1;
		for(int i=0;i<dist.length;i++){
			if(!visited[i]&& dist[i]<min){
				min=dist[i];
				min_index=i;
			}		
		}
		
		return min_index;
	}

}
