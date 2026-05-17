import java.util.ArrayList;

public class Day30 {
    // Graph basic 
      int v; // Number of vertices
      ArrayList<Integer>[] adjList; // Adjacency list representation of the graph
            public Day30(int v) {
          this.v = v;
          this.adjList = new ArrayList[v];
          for (int i = 0; i < v; i++) {
              adjList[i] = new ArrayList<>();
          }
      }
                public void addEdge(int src, int dest) {
            adjList[src].add(dest); // Add edge from src to dest
            adjList[dest].add(src); // Add edge from dest to src (for undirected graph)
        }
        public void printGraph() {
            for (int i = 0; i < v; i++) {
                System.out.print("Vertex " + i + ":");
                for (Integer neighbor : adjList[i]) {
                    System.out.print(" " + neighbor);
                }
                System.out.println();
            }
        }
        public static void main(String[] args) {
            Day30 graph = new Day30(5);
            graph.addEdge(0, 1);
            graph.addEdge(0, 2);
            graph.addEdge(1, 3);
            graph.addEdge(1, 4);
            graph.printGraph();

        }
    // Notes : This implementation of a graph uses an adjacency list representation, where each vertex has a list of its neighboring vertices. The addEdge method adds an edge between two vertices, and the printGraph method displays the graph structure. The graph is undirected, meaning that edges are added in both directions. This allows for efficient storage and traversal of the graph, especially when it is sparse (i.e., has fewer edges compared to the number of vertices).
        // Graph definition : A graph is a data structure that consists of a set of vertices (
      // also called nodes) and a set of edges that connect pairs of vertices. Graphs can be directed (where edges have a direction) or undirected (where edges do not have a direction). They are used to represent relationships between entities, such as social networks, transportation systems, and computer networks. Graphs can be traversed using algorithms like Depth-First Search (DFS) and Breadth-First Search (BFS) to explore their structure and find specific paths or connections between vertices.
}

