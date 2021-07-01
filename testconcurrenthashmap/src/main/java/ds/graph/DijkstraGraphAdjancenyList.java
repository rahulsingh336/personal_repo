package ds.graph;

import java.util.ArrayList;

public class DijkstraGraphAdjancenyList {
  static ArrayList<ArrayList<EdgeGraph>> graph = new ArrayList<>();

  public static void main(String[] args) {

    // we want a graph, see resources
    int x = 4;
    for (int i = 0; i < 5; i++) {
      graph.add(new ArrayList());
    }
    addEdge(graph, 0, 1, 4);
    addEdge(graph, 0, 2, 8);
    addEdge(graph, 1, 2, 2);
    addEdge(graph, 1, 3, 5);
    addEdge(graph, 2, 3, 5);
    addEdge(graph, 2, 4, 9);
    addEdge(graph, 3, 4, 4);

    printGraph(graph);

    boolean[] visited = new boolean[5];
    Integer[] distance = new Integer[5];

    //Find minimum shortest path from given source
	int source = 3;

    //Init, first source as 0 and rest as Infinity
    distance[3] = 0;

    for (int i = 0; i < distance.length; i++) {
    	if(i==3)continue;
		distance[i] = Integer.MAX_VALUE;
    }

    findSPT(5, source, graph, visited, distance);
	  System.out.println("Source\t\t Distance");
    for (int i = 0; i < distance.length; i++) {

      System.out.println(i+"\t\t\t\t"+distance[i]);
    }
  }

	private static void findSPT(int size, int source, ArrayList<ArrayList<EdgeGraph>> graph, boolean[] visited, Integer[] distance) {

  	    if (graph.size()-1 < source){
  	    	return;
		}
		//mark visited
		visited[source] = true;

		for (int i = 0; i < graph.get(source).size(); i++) {
    	    //fill connected node weight
			if(!visited[graph.get(source).get(i).destination]){
				EdgeGraph edgeGraph = graph.get(source).get(i);
				int weight = edgeGraph.weight;
				if( edgeGraph.weight + distance[edgeGraph.source] < distance[graph.get(source).get(i).destination])
				   distance[graph.get(source).get(i).destination] = edgeGraph.weight + distance[edgeGraph.source];
			}
    	}
		findSPT(5, ++source, graph, visited, distance);
   // System.out.println("Debugger");
	}

	private static boolean isAnyUnVisitedNode(boolean[] visited) {
    for (int i = 0; i < visited.length; i++) {
		if(!visited[i])
			return true;
    }
		return false;
	}


	private static void printGraph(ArrayList<ArrayList<EdgeGraph>> graph) {
    for (int i = 0; i < graph.size(); i++) {
      System.out.println("\nAdjacency list of vertex  " + i);
      System.out.print("head ");
      for (int j = 0; j < graph.get(i).size(); j++) {
		  EdgeGraph edgeGraph = graph.get(i).get(j);
		  System.out.print(" --> " + edgeGraph.source + "-" + edgeGraph.destination + "-" + edgeGraph.weight);
      }
      System.out.println();
    }
  }

  private static void addEdge(ArrayList<ArrayList<EdgeGraph>> graph, int u, int v, int w) {
    graph.get(u).add(new EdgeGraph(u, v, w));
    graph.get(v).add(new EdgeGraph(v, u, w));
  }
}

class Edge {
  int source;
  int destination;
  int weight;

  public Edge(int source, int destination, int weight) {
    this.source = source;
    this.destination = destination;
    this.weight = weight;
  }

	public Edge(int source) {
		this.source = source;
	}
}
