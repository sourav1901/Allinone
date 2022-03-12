public class dll {
    
    private static ListNode head;
    private static ListNode tail;
    private static int length;
    public static class ListNode{
        int data;
        ListNode next;
        ListNode pre;
       
        public ListNode(int data) {
            this.data = data;
        } 
    }

    dll(){
        head=null;
        tail=null;
        length = 0;
    }

    public static boolean isEmpty(){
        return length==0;
    }
    public int length(){
        return length;
    }
    public void printForward(){
        ListNode temp = head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void printback(){
        ListNode temp = tail;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp = temp.pre;
        }
        System.out.println("null");
    }

    public void insertForward(int data){
        ListNode newNode = new ListNode(data);
        if(isEmpty()){
            tail = newNode;
        }else{
            head.pre = newNode;
        }
        newNode.next = head;
        head = newNode;
        length++;
    }
    public void insertEnd(int data){
        ListNode newNode = new ListNode(data);
        if(isEmpty()){
            head = newNode;
        }else{
            tail.next = newNode;
            newNode.pre = tail;
        }
        tail = newNode;
        length++;
    }

    public void deleteForward(){
        if(isEmpty()){
            System.out.println("list is empty");
        }
        ListNode temp = head;
        if(head==tail){
            tail=null;
        }else{
            head.next.pre = null;
        }
        head = head.next;
        temp.next = null;
        length--;
    }

    public void deleteEnd(){
        if(isEmpty()){
            System.out.println("list is empty");
        }
        ListNode temp = tail;
        if(head==tail){
            head = null;
        }else{
            tail.pre.next  = null;
        }

        tail = tail.pre;
        temp.pre = null;
        length--;
    }





    public static void main(String[] args) {
        dll d1 = new dll();

        d1.insertForward(23);
        d1.insertForward(24);
        d1.insertForward(25);
        d1.insertForward(26);
        d1.insertForward(27);
        d1.insertEnd(28);

        // d1.deleteForward();
        d1.deleteEnd();
        d1.printForward();


    
    }
}

