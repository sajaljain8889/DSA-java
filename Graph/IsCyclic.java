import java.util.ArrayList;

public class IsCyclic {
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

        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));

        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 0));
      
    }

    public static void main(String args[]){
        int V = 4;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        boolean vis[] = new boolean[V];
        boolean rec[] = new boolean[V];
        int curr = 0;
        // boolean flag = isCyclicDirected(graph, vis ,curr, rec);
        // System.out.println(flag);

        for(int i=0;i<graph.length;i++){
            if(!vis[i]){
                          System.out.println(isCyclicDirected(graph, vis ,i, rec)); 
            }
        }

    }

    private static boolean isCyclicDirected(ArrayList<Edge>[] graph, boolean[] vis, int curr, boolean[] rec) {
        vis[curr] = true;
        rec[curr] = true;
        for(int i = 0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(rec[e.dest] == true){
                  return true;
            }else if(vis[e.dest] == false){
               if( isCyclicDirected(graph, vis, e.dest, rec)){
                return true;
               };
        }
    }
     rec[curr]=false;
        return false;
    }
}