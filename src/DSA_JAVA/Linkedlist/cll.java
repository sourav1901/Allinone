public class cll {

    private  ListNode last;
    private int length;
    
    public static class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int data) {
            this.data = data;
        }
        
    }
    public cll(){
        last = null;
        length= 0;
    }
    public int length(){
       return length;
    }
    public boolean isEmpty(){
        return length==0;
    }

    public void display(){
        if(last==null){
            return;
        }
        ListNode head = last.next;
        while(head!=last){
            System.out.print(head.data+" --> ");
            head = head.next;
        }
        System.out.println(head.data);

    }

    public void insertFirst(int data){
        ListNode temp = new ListNode(data);
        if(last==null){
             last=temp;
        }else{
            temp.next = last.next;
        }
        last.next = temp;
        length++;
    }
    public void insertLast(int data){
        ListNode temp = new ListNode(data);
        if(last==null){
            last = temp;
            last.next = last;
        }else{
            temp.next = last.next;
            last.next = temp;
            last = temp;
        }
        length++;
    }

    public ListNode removeFirst(){
        if(isEmpty()){
            System.out.println("EMPTY ListNode");
        }
        ListNode temp = last.next;
        if(last.next ==last){
            last= null;
        }else{
            last.next = temp.next;
        }
        temp.next = null;
        length--;
        return temp;
    }

    public void createiCrcularLinkedList(){

        ListNode s1= new ListNode(1);
        ListNode s2 = new ListNode(2);
        ListNode s4 = new ListNode(47);
        ListNode s5 = new ListNode(54);
        ListNode s3 = new ListNode(8);
        s1.next = s2;
        s2.next = s3;
        s3.next = s4;
        s4.next = s5;
        s5.next = s1;
        
        last = s5;
    }

    public static void main(String[] args) {
        cll cl = new cll();
        cl.insertFirst(5);
        cl.insertLast(3);
        // cl.createiCrcularLinkedList();
        cl.removeFirst();
        cl.display();
    }
}
