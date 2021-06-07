public static boolean res = true;
  public static boolean find(Node node, int data) {
    // write your code here
    res = (node.data == data);
    for(Node child : node.children) {
        res = res || find(child,data);
    }
    return res;
  }