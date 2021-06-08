public static boolean nodeToRootPath(Node node, int data, ArrayList<Node> al) {
      boolean res = node.data == data;
      for(Node child : node.children) {
          res = res || nodeToRootPath(child,data,al);
      }
      if(res) al.add(node);
      return res;
  }

  public static int distanceBetweenNodes(Node node, int d1, int d2){
    // write your code here
     ArrayList<Node> list1 = new ArrayList<>();
        ArrayList<Node> list2 = new ArrayList<>();

        nodeToRootPath(node, d1, list1);
        nodeToRootPath(node, d2, list2);

        int i = list1.size() - 1;
        int j = list2.size() - 1;

        int LCADistance = 0;

        while (i >= 0 && j >= 0) {
            if (list1.get(i) != list2.get(j))
                break;

            LCADistance++;
            i--;
            j--;
        }

        int dis = (list1.size() + list2.size() - 2 * (LCADistance) + 1 - 1); 

        return dis;
  }