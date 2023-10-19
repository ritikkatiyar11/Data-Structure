import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class classroom {
    static class edge {
        int src;
        int des;
        int wt;

        edge(int src, int des, int wt) {
            this.src = src;
            this.des = des;
            this.wt = wt;

        }
    }

    static void createGraph(ArrayList<edge> graph[]) {
        // create arraylist at every index of array
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<edge>();
            // System.out.println("tested");
        }
        // adding edges
        graph[0].add(new edge(0, 1, 2));

        graph[1].add(new edge(1, 2, 10));
        graph[1].add(new edge(1, 3, 0));

        graph[2].add(new edge(2, 0, 2));
        graph[2].add(new edge(2, 1, 10));
        graph[2].add(new edge(2, 3, -1));

        graph[3].add(new edge(3, 1, 0));
        graph[3].add(new edge(3, 2, -1));

    }


    static void bfs(ArrayList<edge> graph[],int v) {
        Queue<Integer> q=new LinkedList<>();
        boolean[]vis= new boolean[v];
        q.add(0);
        while(!q.isEmpty())
        {
            int curr=q.remove();
            if(!vis[curr])
            {
                System.out.println(curr);
                vis[curr]=true;
                for (int i = 0; i < graph[curr].size(); i++) {
                    edge e=graph[curr].get(i);
                    q.add(e.des);
                }
            }
        }
        
    }
    static void dfs(ArrayList<edge> []graph,int curr,boolean []vis)
    {
        System.out.println(curr);
        vis[curr]=true;
        for (int i = 0; i < graph[i].size(); i++) {
            edge e=graph[i].get(i);
            // if neighbour is unvisited
            if(vis[e.des]==false)
            {
                dfs(graph, e.des, vis);
            }
            
        }
    }

    public static void main(String[] args) {
        int v = 4;
        ArrayList<edge>[] graph = new ArrayList[v];
        createGraph(graph);
        // print 2 s neighbours
        for (int i = 0; i < graph[2].size(); i++) {
            edge e = graph[2].get(i);
            System.out.println(e.src + "->" + e.des + " wt " + e.wt);
        }
        bfs(graph, v);

    }
}
