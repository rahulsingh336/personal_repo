package ds.graph;

import java.util.ArrayList;

public class DFSGraphAdjancenyList {
  static ArrayList<ArrayList> graph = new ArrayList<>();
  public static void main(String[] args) {

	  //we want a graph, see resources
	  int x = 4;
    for (int i = 0; i < 5; i++) {
    	graph.add(new ArrayList());
	}
	  addEdge(graph, 0, 1);
	  addEdge(graph, 0, 2);
	 	addEdge(graph, 1, 3);
	 	addEdge(graph, 1, 4);
	 	addEdge(graph, 3, 4);

	 	printGraph(graph);

	  boolean[] visited = new boolean[5];
	  printDFS(0, 0, visited);

  }

	private static void printGraph(ArrayList<ArrayList> graph) {
    for (int i = 0; i< graph.size(); i++) {
		System.out.println("\nAdjacency list of vertex  " + i);
		System.out.print("head");
		for (int j = 0; j < graph.get(i).size(); j++) {
			System.out.print(" -> "+graph.get(i).get(j));
      }
	System.out.println();
	}
	}

	private static void addEdge(ArrayList<ArrayList> graph, int u, int v) {
  	graph.get(u).add(v);
  	graph.get(v).add(u);
	}

	private static void printDFS(int s, int v, boolean[] visited) {

  	visited[s] = true;
    System.out.println("Visited DFS Path :  " + s);

        for(int j = 0; j < graph.get(s).size(); j++) {
			Integer o = Integer.valueOf((Integer) graph.get(s).get(j));
			if(!visited[o]){
				visited[o] = true;
				printDFS(o, o, visited);
        	}
        }



      }
}
