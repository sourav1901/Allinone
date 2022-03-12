import java.util.HashSet;

public class sll {
   
   static int counter=0;
   
    private ListNode head;

    public static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head , slow = head;
        for(int i=0;i<n;i++) fast = fast.next;
        if(fast == null)return head.next;
        while(fast.next!=null){
            fast = fast.next;
            slow = slow.next;
        }
        // System.out.println(slow.next.data);
        slow.next = slow.next.next;
        return head;
        
    }

    public boolean isListEvenLength(ListNode head){
        while( head!=null && head.next!=null){
            head = head.next.next;
        }
        if(head==null)return true;

        return false;
    }

    public static ListNode oddEvenList(ListNode head){
     //method 1**************
        // if(head == null)return head;

        // ListNode odd = head;
        // ListNode even = head.next;
        // ListNode evenHead = even;
        // while(even!=null && even.next!=null){
        //     odd.next = odd.next.next;
        //     even.next = even.next.next;
        //     odd = odd.next;
        //     even = even.next;
        // }
        // odd.next = evenHead;

        // return head;

     //method 2***********
     
        if(head==null || head.next == null)return head;

        ListNode evenH = null, evenTail = null;
        ListNode oddH = null, oddTail = null;
        ListNode curr = head;
        int i = 1;
        while(curr!=null){
            if(i%2!=0){
                if(oddH==null){
                    oddH = curr;
                    oddTail= curr;
                }else{
                    oddTail.next = curr;
                    oddTail = oddTail.next;
                }
            }else{
                if(evenH==null){
                    evenH = curr;
                    evenTail= curr;
                }else{
                    evenTail.next = curr;
                    evenTail = evenTail.next;
                }
            }
            curr= curr.next;
            i++;
        }

        evenTail.next = null;
        oddTail.next = evenH;


        return oddTail;

    }
    
    public static ListNode OddEvenData(ListNode head){
        if(head== null || head.next== null)return head;

        ListNode oddH = null,oddTail = null;
        ListNode evenH = null,evenTail = null;
        ListNode curr = head;
        while(curr!=null){
            if(curr.data%2==1){
                if(oddH == null){
                    oddH = curr;
                    oddTail = curr;
                }else{
                    oddTail.next = curr;
                    oddTail = oddTail.next;
                }
            }else{
                if(evenH==null){
                    evenH = curr;
                    evenTail= curr;
                }else{
                    evenTail.next = curr;
                    evenTail = evenTail.next;
                }
            }
            curr = curr.next;
        }
        evenTail.next = null;
        oddTail.next = evenH;

        return oddTail;
    }


    public void insert(int data){
        ListNode node = new ListNode(data);
        if(head==null){
            head = node;
        }
        ListNode n=head;
        while(n.next!=null){
            n=n.next;
        }
        n.next=node;
        
    }
    public void insertFirst(int data){
        ListNode newNode = new ListNode(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertAt(int index,int data){ 
        if(index==0)
            insertFirst(data);
        else{
            ListNode newNode = new ListNode(data);
            ListNode curr=head;
            for (int i = 0; i < index-1; i++) {
                curr = curr.next;
            }
            newNode.next = curr.next;
            curr.next = newNode;

        }    
    }


    public void delete(int index){
        if(index==0){
            head = head.next;
        }else{
            ListNode curr = head;
            ListNode next = null;
            for (int i = 0; i < index-1; i++) {
                curr = curr.next;
            }
            next = curr.next;
            curr.next = next.next;
        }
        
    }



    
    public void reverse(){
        ListNode curr = head;
        ListNode pre = null;
        ListNode next = null;
        while(curr!=null){
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr=next;
        }
        head = pre;
    }
    public void printListFromTheEnd(ListNode head){       //Time Complexity: O([ n/2]) ≈ O(n). Space Complexity: O(1).
        if(head==null)
        return;
        printListFromTheEnd(head.next);  
        System.out.print(head.data +"-->"); 

    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {  //Time Complexity – O(n).

            
            if(list1==null)return list2;
            if(list2==null)return list1;
            
            ListNode head = new ListNode(0);
            if(list1.data<=list2.data){
                head = list1;
                head.next = mergeTwoLists(list1.next,list2);
            }else{
                head=list2;
                head.next = mergeTwoLists(list1,list2.next);
            }
            
            return head;
    
    }

    public static ListNode reverseNTimesNode(ListNode head , int n){
        ListNode curr = head;
        ListNode next = null;
        ListNode pre = null;

        int i = n; //reverse n nodes
        while(curr!=null && i>0){
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
            i--;
        }
        //n+1 nodes recounter to head
        if(next!=null){
            head.next=reverseNTimesNode(next, n);
        }


        return pre;

    }
    

    public boolean loopExist(){
        // HashSet<ListNode> hs = new HashSet<>();
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null && fast.next!=null ){
            fast = fast.next.next;
            slow = slow.next;
            if(fast==slow){
                return true;
            }
            // if(!hs.contains(fast)){
            //     hs.add(fast);
            // }else{
            //     return true;
            // }
        }
        return false;
    }
    public Object startingLoopPoint(){
        ListNode fast = head;
        ListNode slow = head;
        boolean loopExist=false;
        while(fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast==slow){
                 loopExist=true;
                 break;
            }
           
        }
        if(loopExist){
            slow = head;
            while(slow!=fast){
                slow = slow.next;
                fast = fast.next;
            }
            return fast.data;
        }else{
            return null;
        }
    }
    
    public void breakLoop(){
        ListNode fast = head;
        ListNode slow = head;
        boolean loopExist=false;
        while(fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast==slow){
                 loopExist=true;
                 break;
            }
           
        }
        if(loopExist){
            slow = head;
            while(slow.next!=fast.next){
                slow = slow.next;
                fast = fast.next;
            }
            fast.next = null;
        }
    }

  /* Q. Given a singly linked list, write a function to find the last
element from the beginning whose n%k == 0, where n is the number of elements in the list
and k is an integer constant. For example, if n = 19 and k = 3 then we should return 18
th node.
solution:-*/
    public static ListNode ModularNode(ListNode head,int k){
        ListNode Mn = head;
        int i=0;
        if(k<=0){
            return null;
        }
        while(head!=null){
            if(i%k==0){
                Mn = head;
            }
            i++;
            head = head.next;
        }
        return Mn;
    }

    //2nd listnode from middle
    public static void middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        while(slow!=null){
            System.out.print(slow.data + "-->");
            slow = slow.next;
        }
        System.out.println("null");
    }

    public  void show(){
        ListNode current  = head;
        while(current!=null){
            System.out.print(current.data +" --> ");
            current = current.next;
            
        }
        System.out.println("null");
    }
    

    
    public static void main(String[] args) {
        sll sl = new sll();
        sl.head = new ListNode(1);
        ListNode s2 = new ListNode(2);
        ListNode s4 = new ListNode(47);
        ListNode s5 = new ListNode(54);
        ListNode s3 = new ListNode(8);
        sl.head.next = s2;
        s2.next = s3;
        s3.next = s4;
        s4.next = s5;
        s5.next = null;
        sl.insert(32);
        // sl.insert(37);
        // sl.insert(35);
        // sl.insert(45);



        sl.reverse(); 
        // removeNthFromEnd(sl.head, 3);
        // oddEvenList(sl.head);
        OddEvenData(sl.head);
        // reverseNTimesNode(sl.head, 2);
        // System.out.println(sl.loopExist());  
        // sl.breakLoop();
        middleNode(sl.head);
        // ModularNode(sl.head, 3);
        sl.delete(3);
        sl.insertAt(3, 40);
        sl.show();
        // System.out.println(sl.isListEvenLength(sl.head)); 
        // sl.printListFromTheEnd(sl.head);
        // System.out.println(sl.startingLoopPoint());


    }

}
