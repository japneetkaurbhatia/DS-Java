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
            System.out.println(ans + dest);
            return 1;
        } 
        int count = 0;
        vis[src] = true;
        for(Edge e : graph[src]) {
            if(!vis(e.v))
                count += allPath(e.v, dest, ans+src);
        }
        vis[src] = true;
        return count;
    }

    public static void printPreOrder(int src, int wsf, String asf, boolean[] vis) {
        System.out.println(src + "-> " + asf + "@ " + wsf);
        vis[src] = true;
        for(Edge e : graph[src]) {
            if(!vis[e.v]) {
                printPreOrder(e.v, wsf + e.w, asf+src, vis);
            }
        }
        vis[src] = false;
        return;
    }

    public static void printPostOrder(int src, boolean[] vis) {
        vis[src] = true;
        for(Edge e : graph[src]) {
            if(!vis[e.v]) {
                printPostOrder(e.v, wsf + e.w, asf+src, vis);
            }
        }
        System.out.println(src + "-> " + asf + "@ " + wsf);
        vis[src] = false;
        return;
    }

    public static class pair {
        int largestWeight = -(int)1e9;
        String largestPath = "";
        int smallestWeight = (int)1e9;
        String smallestPath = "";

        int ceil = (int)1e9;
        int floor = -(int)1e9;
    }

    public static class pqPair {
        int wsf = 0;
        String psf = "";

        pqPair(int wsf, String psf) {
            this.wsf = wsf;
            this.psf = psf;
        }
    }

    public static PriorityQueue<pqPair> pq = new PriorityQueue<>((a,b) => {
        return a.wsf - b.wsf;
    });

    public static void allSolution(int src, int dest, boolean[] vis, pair p, String psf, int wsf, int givenWeight, int k)
    {
        if(src == dest) {
            if(wsf > p.largestWeight) {
                p.largestWeight =  wsf;
                p.largestPath = psf + dest;
            }
            if(wsf < p.smallestWeight) {
                p.smallestWeight =  wsf;
                p.smallestPath = psf + dest;
            }

            if(wsf < givenWeight)
                p.floor = Math.max(p.floor, wsf);
            if(wsf > givenWeight)
                p.ceil = Math.min(p.ceil, wsf);

            pq.add(new pqPair(wsf, psf + dest));
            if(pq.size() > k) pq.remove();

            return;
        }
        vis[src] = true;
        for(Edge e : graph[src]) {
            if(!vis[e.v])
                allSolution(e.v, dest, vis, p, asf + src , wsf + e.w, givenWeight, k);
        }
        vis[src] = false;
    }

    public static void dfs(int src, boolean[] vis) {
        vis[src] = true;
        for(Edge e : graph[src]) 
            if(!vis[e.v])
                dfs(e.v, vis);
    }

    public static void gcc() {
        boolean[] vis = new boolean[N];
        int cmpt = 0;
        for(int i = 0; i < N; i++) {
            if(!vis[i]) {
                cmpt++;
                dfs(i, vis);
            }
        }
    }

    // O(nm)
    public static void  dfs_island(int[][] mat, int[][] dir, int i, int j) {
        mat[i][j] = 0;
        for(int d = 0; d < 4; d++) {
            int r = i + dir[d][0];
            int c = j + dir[d][1];

            if(r >= 0 && c >= 0 && r < mat.length && c < mat[0].length && mat[r][c] == 1)
                dfs_island(mat, dir, r, c);
        }
    }

    public static int numberIsland(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        int[][] dir = { {1, 0}, {-1, 0}, {0, 1}, {0, -1}};

        int count = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(mat[i][j] == 1) {
                    dfs_island(mat, dir, i , j);
                    count++;
                }
            }
        }
        return count;
    }

    public static void hamintonian_dfs(int src, int osrc, boolean[] vis, int noe, String psf) {
        if(noe == N - 1) {
            System.out.print(psf + src);
            int idx = findEdge(src, osrc);
            if(idx != -1)
                System.out.print("*");
            System.out.println();
            return;
        }
        vis[src] = true;
        for(Edge e : graph[src]) {
            if(!vis[e.v])
                hamintonian_dfs(e.v, osrc, vis, nor+1, psf + src);
        }
        vis[src] = false;
    }

    public static void hamintonianPath() {
        hamintonian_dfs(0, 0, vis, 0, "");
    }

    public static int moonDFS(ArrayList<Integer>[] graph, int src, boolean[] vis) {
        vis[src] = true;
        int size = 0;
        for(Integer e : graph[src]) {
            size += moonDFS(graph, e, vis);
        }
        return size + 1;
    }

    // jouney to moon or perfect frd
    public static long JourneyToMoon(int n , int[][] astronaut) {
        ArrayList<Integer>[] graph = new ArrayList[n];
        for(int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        //graph creation
        for(int[] a : astronaut) {
            graph[a[0]].add(a[1]);
            graph[a[1]].add(a[0]);
        }

        // size of each component
        ArrayList<Integer> sizeArray = new ArrayList<>();
        boolean[] vis = new boolean[n];
        for(int i = 0; i < n; i++) {
            if(!vis[i])
                sizeArray.add(moonDFS(graph, i, vis));
        }

        // pairs
        long ssf = 0, res = 0;
        for(int ele : sizeArray) {
            res += ele * ssf;
            ssf += ele;
        }
        return res;
    }

    //BFS
    public static void bfs(int src, boolean[] vis) {
        int level = 0;
        int cycleCount = 0;

        LinkedList<Integer> que = new LinkedList<>();
        que.addLast(src);
        while(que.size() != 0) {
            int size = que.size();
            System.out.print(level + "->");
            while(size -- > 0) {
                int rvtx = que.removeFirst();
                if(vis[rvtx]) {
                    cycleCount++;
                    continue;
                }
                System.out.print(rvtx + " ");
                vis[rvtx] = true;
                for(Edge e: graph[rvtx])  {
                    if(!vis[e.v])
                        que.addLast(e.v);
                }
            }
            System.out.println();
            level++;
        } 
    }

    public static void bfs_02(int src, boolean[] vis) {
        int level = 0;
        int cycleCount = 0;

        LinkedList<Integer> que = new LinkedList<>();
        que.addLast(src);
        vis[src] = true; // *
        while(que.size() != 0) {
            int size = que.size();
            System.out.print(level + "->");
            while(size -- > 0) {
                int rvtx = que.removeFirst();
                // if(vis[rvtx]) {
                //     cycleCount++;
                //     continue;
                // }
                System.out.print(rvtx + " ");
                vis[rvtx] = true;
                for(Edge e: graph[rvtx])  {
                    if(!vis[e.v])
                        que.addLast(e.v);
                        vis[e.v] = true;  // *
                }
            }
            System.out.println();
            level++;
        } 
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
        // display();
        boolean[] vis = new boolean[N];
        printPreOrder(0, vis);
    }
}