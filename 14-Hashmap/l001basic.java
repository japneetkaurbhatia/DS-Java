import java.util.HashMap;
public class l001basic {
    public static void basic_01() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Nepal", 233);
        map.put("UK", 45);
        map.put("USA", 20);
        map.put("Russia", 18);
        map.put("USA", 19);

        System.out.println(map);
        for(String keys : map.keySet()) {
            System.out.println(keys + "->" + map.get(keys));
        }
        System.out.println(map.size());
        System.out.println(map.get("USA"));
        System.out.println(map.get("USa"));

        //Key is present or not
        String key = "USa";
        if(map.containsKey(key))
            System.out.println(map.get(key));
        else
            System.out.println("Not found");
    }

    public static void main(String[] args){
        basic_01();
    }
}