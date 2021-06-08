// public static boolean nodeToRootPath(Node node, int data, ArrayList<Node> list) {
//         boolean res = node.data == data;
//         for (Node child : node.children) {
//             res = res || nodeToRootPath(child, data,list);
//         }

//         if (res)
//             list.add(node);

//         return res;
//     }
//   public static int lca(Node node, int d1, int d2) {
//     // write your code here
//     ArrayList<Node> list1 = new ArrayList<>();
//         ArrayList<Node> list2 = new ArrayList<>();

//         nodeToRootPath(node, d1, list1);
//         nodeToRootPath(node, d2, list2);

//         int i = list1.size() - 1;
//         int j = list2.size() - 1;

//         Node LCA = null;
//         int LCADistance = 0;

//         while (i >= 0 && j >= 0) {
//             if (list1.get(i) != list2.get(j))
//                 break;

//             LCADistance++;
//             LCA = list1.get(i);
//             i--;
//             j--;
//         }

//         return LCA.data;
//   }

//self****************************
 public static boolean nodeToRootPath(Node node, int data, ArrayList<Node> al) {
      boolean res = node.data == data;
      for(Node child : node.children) {
          res = res || nodeToRootPath(child,data,al);
      }
      if(res) al.add(node);
      return res;
  }

  public static int lca(Node node, int d1, int d2) {
    // write your code here
    ArrayList<Node> l1 = new ArrayList<>();
    ArrayList<Node> l2 = new ArrayList<>();
    
    nodeToRootPath(node,d1,l1);
    nodeToRootPath(node,d2,l2);
    
    Node LCA = null;
    int i = l1.size()-1;
    int j = l2.size()-1;
    while( i >= 0 && j >= 0) {
        if(l1.get(i) == l2.get(j)) LCA = l1.get(i);
        i--; j--;
    }
    return LCA.data;
  }