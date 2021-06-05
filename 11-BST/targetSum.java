public static void inOrder(Node node, ArrayList<Integer> list) {
        if (node == null)
            return;

        inOrder(node.left, list);
        list.add(node.data);
        inOrder(node.right, list);

    }
    
    public static void targetSum(Node node, int tar) {
       ArrayList<Integer> list = new ArrayList<>();
       inOrder(node,list);
       
       int i = 0, j = list.size()-1;
       while(i < j) {
           if(list.get(i) + list.get(j) < tar) i++;
           else if(list.get(i) + list.get(j) > tar) j--;
           else {
               System.out.println(list.get(i) + " " + list.get(j));
               i++;
               j--;
           }
       }
    }