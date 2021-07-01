package ds.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class BFSGraphAdjancenyList {
	  static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
	  public static void main(String[] args) {

		  //we want a graph, see resources
		  int x = 4;
		  for (int i = 0; i < 4; i++) {
			  graph.add(new ArrayList());
		  }
		  addEdge(graph, 0, 1);
		  addEdge(graph, 0, 2);
		  addEdge(graph, 1, 2);
		  addEdge(graph, 2, 0);
		  addEdge(graph, 2, 3);
		  addEdge(graph, 3, 3);

		  printGraph(graph);
		  int source = 2;
		  BFSfinder(source);
	  }

	private static void BFSfinder(int s) {

	  	boolean[] visited = new boolean[5];
		// Create a queue for BFS
		LinkedList<Integer> queue = new LinkedList<Integer>();

		queue.add(s);
		visited[s] = true;

		while (!queue.isEmpty()) {

			s = queue.poll();

			System.out.print(s+" ");

      for (int i = 0; i <graph.get(s).size(); i++) {
		  if(!visited[Integer.valueOf(graph.get(s).get(i))]){
		  	visited[Integer.valueOf(graph.get(s).get(i))] = true;
		  	queue.add(Integer.valueOf(graph.get(s).get(i)));
		  }
      }}

	}

	private static void printGraph(ArrayList<ArrayList<Integer>> graph) {
		for (int i = 0; i< graph.size(); i++) {
			System.out.println("\nAdjacency list of vertex  " + i);
			System.out.print("head");
			for (int j = 0; j < graph.get(i).size(); j++) {
				System.out.print(" -> "+graph.get(i).get(j));
			}
			System.out.println();
		}
	}

	private static void addEdge(ArrayList<ArrayList<Integer>> graph, int u, int v) {
		graph.get(u).add(v);
		//graph.get(v).add(u);
	}
}

