 public static Node linearize_(Node node){
    // write your code here
    if(node.children.size() == 0)  return node;
    int n = node.children.size();
    Node gtail = linearize_(node.children.get(n-1));
    for(int i = n - 2; i >= 0; i--) {
        Node tail = linearize_(node.children.get(i));
        tail.children.add(node.children.get(i+1));
        node.children.remove(i + 1);
    }
    return gtail;
  }

  public static void linearize(Node node){
    // write your code here
    linearize_(node);
    // return gtail;
  }