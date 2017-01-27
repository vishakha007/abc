package GraphTheory;
class Edge{
	int source, dest;

	public Edge(int source, int dest) {
		super();
		this.source = source;
		this.dest = dest;
	}

	public Edge() {
		// TODO Auto-generated constructor stub
	}
	
	
}
public class UnionFInd {
	int V,E;
	Edge []edge;
	public UnionFInd(int v, int e) {
		//super();
		V = v;
		E = e;
		edge=new Edge[E];
		for(int i =0;i<E;i++)
			edge[i]=new Edge();
	}
	
	int Find(int[]parent,int i){
		
		for(int j=0;j<parent.length;j++)
			System.out.print("  "+parent[j]);
		System.out.println("  	Finding parent of "+i);
		if(parent[i]==-1)
			return i;
		return Find(parent, parent[i]);
	}
	int HasCycle(UnionFInd graph){
		//If the number of Edges are less than vertices the graph does not have cycle
		//or it is not a graph to begin with
		if(graph.V > graph.E)
			return 0;
		int []parent=new int[graph.V];
		for(int i=0;i<parent.length;i++)
			parent[i]=-1;
		for(int i=0;i<graph.E;i++){
			System.out.println("\tTraversing edge "+graph.edge[i].source +" -> "+graph.edge[i].dest);
			int s= Find(parent,graph.edge[i].source);
			int d=Find(parent,graph.edge[i].dest);
			if(s==d)
				return 1;
			Union(parent, s,d);
		}
		return 0;
	}

	private void Union(int[] parent, int s, int d) {
		// TODO Auto-generated method stub
		//int s_set=Find(parent,s);
		//int d_set=Find(parent,d);
		parent [s]=d;
		//parent [s_set]=d_set;

	}
	public static void main(String args[]){
		UnionFInd graph=new UnionFInd(9,13);
		graph.edge[0]=new Edge(0,1);
		graph.edge[1]=new Edge(0,7);
		graph.edge[2]=new Edge(1,2);
		graph.edge[3]=new Edge(1,6);
		graph.edge[4]=new Edge(2,3);
		graph.edge[5]=new Edge(2,5);
		graph.edge[6]=new Edge(2,8);
		graph.edge[7]=new Edge(3,4);
		graph.edge[8]=new Edge(3,5);
		graph.edge[9]=new Edge(4,5);
		graph.edge[10]=new Edge(5,6);
		graph.edge[11]=new Edge(6,8);
		graph.edge[12]=new Edge(6,7);
		//graph.edge[13]=new Edge(7,8);
		if(graph.HasCycle(graph)==1)
			System.out.println("This graph has cycle");
		else
			System.out.println("This graph has cycle");

	}
}
