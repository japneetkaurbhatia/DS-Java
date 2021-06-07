 public static int height(Node node) {
    // write your code here
    int h = -1;
    for(Node child : node.children) {
        h = Math.max(h,height(child));
    }
    return h + 1;
  }