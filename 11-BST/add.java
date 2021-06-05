 public static Node add(Node node, int data) {
    // write your code here
    if(node == null) 
        return new Node(data,null,null);
    
    if(node.data < data) 
        node.right = add(node.right,data);
    else if(node.data > data)
        node.left = add(node.left,data);
    else 
        return node;
    
    return node;
    
  }