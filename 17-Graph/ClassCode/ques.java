import java.util.*;

public class question {

    public boolean isBipartite(int[][] graph, int src, int[] vis) {
        // -1 -> undefine, 0 -> red, 1 -> green.

        LinkedList<Integer> que = new LinkedList<>();
        que.addLast(src);
        int color = 0;

        while (que.size() != 0) {
            int size = que.size();
            while (size-- > 0) {
                int rvtx = que.removeFirst();
                if (vis[rvtx] != -1) {
                    if (vis[rvtx] != color) // conflict
                        return false;

                    continue;
                }

                vis[rvtx] = color;
                for (int v : graph[rvtx]) {
                    if (vis[v] == -1) {
                        que.addLast(v);
                    }
                }
            }

            color = (color + 1) % 2;
        }

        return true;
    }

    public boolean isBipartite(int[][] graph) {
        int N = graph.length;
        int[] vis = new int[N];
        Arrays.fill(vis, -1);

        for (int i = 0; i < N; i++) {
            if (vis[i] == -1 && !isBipartite(graph, i, vis))
                return false;
        }

        return true;
    }

    public static int spreadInfection(int src, Int timeLimit) {
        LinkedList<Integer> que = new LinkedList<>();
        boolean[] vis = new boolean[N];
        que.addLast(src);
        int time = 0, infectedCount = 1;
        vis[src] = true;

        while (que.size() != 0) {
            int size = que.size();
            while (size-- > 0) {
                int rvtx = que.removeFirst();

                for (Edge e : graph[rvtx]) {
                    if (!vis[e.v]) {
                        vis[e.v] = true;
                        que.add(e.v);
                        if (time + 1 < timeLimit)
                            infectedCount++;
                        else
                            return infectedCount;
                    }

                }
            }

            time++;
        }

        return infectedCount;
    }

}














import java.io.*;
import java.util.*;

public class Main {
   static class Edge {
      int src;
      int nbr;

      Edge(int src, int nbr) {
         this.src = src;
         this.nbr = nbr;
      }
   }

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int vtces = Integer.parseInt(br.readLine());
      ArrayList<Edge>[] graph = new ArrayList[vtces];
      for (int i = 0; i < vtces; i++) {
         graph[i] = new ArrayList<>();
      }

      int edges = Integer.parseInt(br.readLine());
      for (int i = 0; i < edges; i++) {
         String[] parts = br.readLine().split(" ");
         int v1 = Integer.parseInt(parts[0]);
         int v2 = Integer.parseInt(parts[1]);
         graph[v1].add(new Edge(v1, v2));
         graph[v2].add(new Edge(v2, v1));
      }

      int src = Integer.parseInt(br.readLine());
      int t = Integer.parseInt(br.readLine());
      
      // write your code here
      int N = edges;
      LinkedList<Integer> que = new LinkedList<>();
        boolean[] vis = new boolean[N];
        que.addLast(src);
        int time = 0, infectedCount = 1;
        vis[src] = true;

        while (que.size() != 0) {
            int size = que.size();
            while (size-- > 0) {
                int rvtx = que.removeFirst();

                for (Edge e : graph[rvtx]) {
                    if (!vis[e.nbr]) {
                        vis[e.nbr] = true;
                        que.add(e.nbr);
                        if (time + 1 < t)
                            infectedCount++;
                        // else
                            // System.out.print(infectedCount);
                    }

                }
            }

            time++;
        }

        System.out.print(infectedCount);
   }

}