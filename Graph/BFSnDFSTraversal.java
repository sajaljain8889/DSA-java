package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFSnDFSTraversal {

    static class Edge {
        int src;
        int dest;

        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));
        graph[5].add(new Edge(5, 3));

        graph[6].add(new Edge(6, 5));

    }

    public static void main(String args[]) {

        int V = 7;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        boolean vis[] = new boolean[V];
        // for (int i = 0; i < 7; i++) {
        // if (vis[i] == false) {
        // bfs(graph, V, vis, i);
        // }
        // }

        // dfs(graph, 0, vis);
        // System.out.print("");

        int tar = 5;
        String path = "";
        allPathDfs(graph, 0, vis, tar, path);
    }

    private static void findNeighbours(ArrayList<Edge>[] graph, int v) {
        for (int i = 0; i < graph[v].size(); i++) {
            System.out.print(graph[v].get(i).src + "--> " + graph[v].get(i).dest + " ");
        }
    }

    private static void dfs(ArrayList<Edge>[] graph, int curr, boolean vis[]) {
        System.out.print(curr + " ");
        vis[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (vis[e.dest] == false) {
                dfs(graph, e.dest, vis);
            }
        }
    }

    private static void allPathDfs(ArrayList<Edge>[] graph, int curr, boolean vis[], int tar, String path) {

    }

    private static void bfs(ArrayList<Edge>[] graph, int v, boolean vis[], int curr) {
        Queue<Integer> q = new LinkedList<>();

        q.add(curr);
        while (!q.isEmpty()) {
            curr = q.remove();
            if (vis[curr] == false) {
                System.out.print(curr + " ");
                vis[curr] = true;
                for (int i = 0; i < graph[curr].size(); i++) {
                    q.add(graph[curr].get(i).dest);
                }
            }
        }

    }

}
