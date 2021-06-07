public static boolean res = true;
 
  public static boolean nodeToRootPath(Node node, int data, ArrayList<Integer> al){
    res = (node.data == data);
    for(Node child : node.children) {
        res = res || nodeToRootPath(child,data,al);
        
    }
    if(res) al.add(node.data);
    return res;
  }