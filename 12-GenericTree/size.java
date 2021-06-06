 public static int size(Node node){
    // write your code here
    int sz = 0;
    for(Node child : node.children) {
        sz += size(child);
    }
    return sz + 1;
  }