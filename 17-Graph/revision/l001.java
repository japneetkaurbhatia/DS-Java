import java.util.ArrayList;

public class l001 {

    //List Representation

    //pair class
    public static class Edge {
        int v = 0;
        int w = 0;

        Edge(int v, int w) {
            this.v = v;
            this.w = w;
        }

        public String toString() {
            return "(" + this.v + ", " + this.w + ")";
        }
    }

    public static int N = 7;

    // 7 new arraylist in one array
    public static ArrayList<Edge>[] graph = new ArrayList[N];

    public static void addEdge(int u, int v, int w) {
        // bidirectional
        graph[u].add(new Edge(v, w));
        graph[v].add(new Edge(u, w));
    }

    public static void display() {
        for(int i = 0; i < N; i++) {
            System.out.print(i + " -> ");
            for(Edge e : graph[i]) 
                System.out.print(e);
            System.out.println();
        }
    }

    public static int findEdge(int u, int v) {
        for(int i = 0; i < graph[u].size(); i++) {
            Edge e = graph[u].get(i);
            if(e.v == v) return i;
        }
        return -1;
    }

    public static void removeEdge(int u, int v) {
        int idx1 = findEdge(u, v);  // o(n)
        int idx2 = findEdge(v, u);  // o(n)
        if(idx1 == -1 || idx2 == -1)
        graph[u].remove(idx1);  // o(n)
        graph[v].remove(idx2);  // o(n)
        // overall O(n)
    }

    public static void removeVertex(int u) {
        // do from ending to avoid shifting
        while(graph[u].size() != 0) {
            int n = graph[u].size();
            Edge e = graph[u].get(n - 1);
            removeEdge(u, e.v);
        }
    }

    public static boolean hasPath(int src, int dest, boolean[] vis) {
        if(arc == dest) return true;
        boolean res = false;
        vis[src] = true;
        for(Edge e : graph[src]) {
            if(!vis(e.v))
                res = res || hasPath(e.v, dest);
        }
        return res;
    }

    public static int allPath(int src, int dest, boolean[] vis, String ans) {
        if(src == dest){
            System.out.println(ans)
            return 1;
        } 
        int count = 0;
        vis[src] = true;
        for(Edge e : graph[src]) {
            if(!vis(e.v))
                count += res || allPath(e.v, dest, ans+src);
        }
        vis[src] = true;
        return count;
    }

    public static void printPreOrder(int src, boolean[] vis) {
    }

    public static void printPostOrder(int src, boolean[] vis) {
    }

    public static void main(String[] args) {
        //list represntation , harr index k correspond arraylist bnegi
        for(int i = 0; i < N; i++) 
            graph[i] = new ArrayList<>();
        addEdge(0, 1, 10);
        addEdge(0, 3, 10);
        addEdge(1, 2, 10);
        addEdge(2, 3, 10);
        addEdge(3, 4, 10);
        addEdge(4, 5, 10);
        addEdge(4, 6, 10);
        addEdge(5, 6, 10);
        display();
    }
}