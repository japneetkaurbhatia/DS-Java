import java.util.PriorityQueue;
public class maxPQ {
    public static void basic() {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> {
                return b -a;
        });
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