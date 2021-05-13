class Solution {
    public int tribonacci(int n) {
        if(n <= 2) return n==2 ? 1 : n;        
        return tribonacci(n - 1) + tribonacci(n -2) + tribonacci(n - 3);
    }
}