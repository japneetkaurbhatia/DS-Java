 //2nd mid in even and odd
    public int mid(){
      // write your code here
      Node slow = this.head;
      Node fast = this.head;
      
      while(fast != null && fast.next != null){
          fast = fast.next.next;
          slow = slow.next;
      }
      
      return slow.data;
    }