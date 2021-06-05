public static boolean find(Node node, int data){
    // write your code here
    if(node == null) return false;
    while(node != null){
        if(node.data == data)  return true;
        else if(node.data < data) node = node.right;
        else node = node.left;
    }
    return false;
  }  

  public static int lca(Node node, int d1, int d2) {
    // write your code here
    if(node == null) return 0;
    while(node != null) {
        if(node.data > d1 && node.data > d2) node = node.left;
        else if(node.data < d1 && node.data < d2) node = node.right;
        else return find(node,d1) && find(node,d2) ? node.data : 0;
    }
    return 0;
  }