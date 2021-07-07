public class diceWays {
    public static void print(int[] arr) {
        for(int ele : arr)
            System.out.print(ele + " ");
        System.out.println();
    }

    public static void print2D(int[][] arr) {
        for(int[] ele : arr)
            System.out.print(ele);
        System.out.println();
    }
    
    public static void main(String[] args) {
        fibo();
    }
}