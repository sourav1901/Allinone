import java.util.EmptyStackException;

public class QueueUsingLinkedList {

    private ListNode front;
    private ListNode rear;
    private int length;

    class ListNode{
        private ListNode next;
        private int data;


        public ListNode(int data){
            this.data = data;
        }
    }

    QueueUsingLinkedList(){
        front = null;
        rear = null;
        length = 0;

    }

    public int size(){
        return length;
    }

    public boolean isEmpty(){
        return length==0;
    }


    //insert at last
    public void enQueue(int data){
        ListNode temp = new ListNode(data);
        if(isEmpty()){
            front = temp;
        }else{
            rear.next = temp;
        }
        rear = temp;
        length++;
    }
    //delete from front
    public void deQueue(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        front = front.next;
        if(front==null){
            rear = null;
        }
        length--;
    }

    public  void show(){
        ListNode current  = front;
        while(current!=null){
            System.out.print(current.data +" --> ");
            current = current.next;
            
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        QueueUsingLinkedList queue = new QueueUsingLinkedList();
        queue.enQueue(15);
        queue.enQueue(12);
        queue.enQueue(11);
        queue.enQueue(10);

        queue.deQueue();
        queue.show();
    }
    
}
