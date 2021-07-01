package ds.graph;

import java.util.ArrayList;

public class CreateGraphAdjancenyList {

  public static void main(String[] args) {
	  ArrayList<ArrayList> graph = new ArrayList<>();
	  //we want a graph, see resources
	  int x = 4;
    for (int i = 0; i < 4; i++) {
    	graph.add(new ArrayList());
	}
		addEdge(graph, 0, 2);
	 	addEdge(graph, 0, 1);
	 	addEdge(graph, 1, 2);
	 	addEdge(graph, 1, 3);
	 	addEdge(graph, 2, 3);

	 	printGraph(graph);

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
}
