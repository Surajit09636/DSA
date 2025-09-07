package graph;

import java.util.*;

public class Graph {

    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 1, 10));

        graph[1].add(new Edge(1, 2, 5));
        graph[1].add(new Edge(1, 3, -67));

        graph[2].add(new Edge(2, 0, -6));
        graph[2].add(new Edge(2, 1, 30));
        graph[2].add(new Edge(2, 3, 14));

        graph[3].add(new Edge(3, 1, 7));
        graph[3].add(new Edge(3, 2, 9));
    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int v = 4;

        // Suppressed warning for generic array creation
        ArrayList<Edge>[] graph = (ArrayList<Edge>[]) new ArrayList[v];
        createGraph(graph);

        // Print all neighbors of vertex 2
        for (int i = 0; i < graph[2].size(); i++) {
            Edge e = graph[2].get(i);
            System.out.println(e.dest + " "+e.wt);
        }
    }
}
