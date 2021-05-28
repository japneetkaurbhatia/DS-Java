// import java.util.Scanner;
import java.util.PriorityQueue;
public class minPQ {
    public static void basic() {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 10; i >= 0; i--) {
            pq.add(i);
        }
        while(pq.size() != 0){
            int ele = pq.peek();
            pq.remove();
            System.out.println(ele);
        }
    }
    public static void main(String[] args){
        basic();
    }
}