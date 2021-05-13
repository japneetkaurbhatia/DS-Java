public class ques{
public static boolean isPrime(int n){
        for(int i = 2;i * i <= n;i++){
            if(n % i == 0) return false;
        }
        return true;
    }

 public static void primeNumbers(int n,ArrayList<Integer> ans){
        for(int i = 2; i * i <= n; i++){
            if(isPrime(i)) ans.add(i);
        }
    }

    public static void primeFactors(int num,ArrayList<Integer> list){

        int idx = 0;
        while(num != 1 && idx < list.size()){
            int count = 0;
            while(num % list.get(idx) == 0){
                num /= list.get(idx);
                count++;
            }
            if(count > 0)
               System.out.print(list.get(idx) + "^" + count + " ");
            idx++;
        }
        
        if(num > 1)
            System.out.print(num + "^" + 1);
        
        System.out.println();
    }

    public static void primeFactorsForQuery(int[] query){
        ArrayList<Integer> list = new ArrayList<>();
        primeNumbers(10000,list);

        for(int ele : query){
            primeFactors(ele,list);
        }
    }

    public static void main(String[] args){
        // String str = scn.nextLine();
        // allSubString(str);

        // int n = scn.nextInt(); scn.nextLine();
        // while(n-->0){
        //     System.out.println(withoutX2(scn.nextLine()));
        // }

        // ArrayList<Integer> ans = occuOfChar(str,'a');
        // System.out.println(ans);

        // for(int ele : ans) System.out.println(ele);
        // System.out.println(subSeq(str));   
    
        // System.out.println(permutation("abc"));
        
        int[] arr = new int[scn.nextInt()];
        for(int i=0;i<arr.length;i++) arr[i] = scn.nextInt();
        primeFactorsForQuery(arr);
    }

}