class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length, m = matrix[0].length;
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->{
            return matrix[a/m][a%m] - matrix[b/m][b%m];
        });
        for(int i = 0; i < n; i++)
            pq.add(i * m);
        while(--k > 0){
            int idx = pq.remove();
            int r = idx/m;
            int c = (idx%m);
            if(c + 1 < m)
                pq.add(r * m + c + 1);
        }
        int idx = pq.peek();
        return matrix[idx/m][idx%n];
    }
}