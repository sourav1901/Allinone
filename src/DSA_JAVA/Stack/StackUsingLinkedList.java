import java.util.EmptyStackException;

public class StackUsingLinkedList {
    
    private ListNode top;
    private int length;


    class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
        }
    }
    public StackUsingLinkedList(){
        top = null;
        length = 0;

    }
    public int length(){
        return length;
    }
    public boolean isEmpty(){
        return length ==0;
    }

    public void push(int data){
        ListNode temp = new ListNode(data);
        temp.next = top;
        top = temp;
        length++;
    }
    public int pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        int result = top.data;
        top = top.next;
        length--;
        return result;
        
    }
    public int peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return top.data;
    }
    public  void show(){
        ListNode current  = top;
        while(current!=null){
            System.out.print(current.data +" --> ");
            current = current.next;
            
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        
        StackUsingLinkedList stack = new StackUsingLinkedList();
        stack.push(14);
        stack.push(13);
        stack.push(12);
        stack.push(11);

        stack.show();
        stack.pop();
        stack.show();

    }
    
}
