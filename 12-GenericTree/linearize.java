public static Node getTail(Node node){
      Node curr = node;
      while(curr.children.size() != 0)
        curr = curr.children.get(0);
    return curr;
  }

  public static void linearize(Node node){
    // write your code here
    for(Node child : node.children) {
        linearize(child);
    }
    
    for(int i = node.children.size() - 2; i >= 0; i--) {
        Node tail = getTail(node.children.get(i));
        tail.children.add(node.children.get(i+1));
        node.children.remove(i + 1);
    }
  }