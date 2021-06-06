public static int max(Node node) {
    // write your code here
    int maxEle = node.data;
    for(Node child : node.children) {
        maxEle = Math.max(max(child),maxEle);
    }
    return maxEle;
  }