public static void ceilAndFloor(Node node, int data) {
    // Write your code here
    if(node.data > data) ceil = Math.min(ceil,node.data);
    if(node.data < data) floor = Math.max(floor,node.data);
    for(Node child : node.children) ceilAndFloor(child,data);
  }