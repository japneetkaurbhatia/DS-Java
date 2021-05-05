public int length(){
    int len = 0;
    Node curr = head;
    while(curr != null){
        len++;
        curr = curr.next;
    }
    return len;
}