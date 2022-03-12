public class LinkedList{
    
    Node head;
    public void insert(int data){
        Node node = new Node();
        node.data =data;
        node.next = null;

        if(head == null){                                                                                                                      
            head = node;
        }
        else{
            Node n= head;
            while(n.next != null){
                 n= n.next;
            }
            n.next = node;
        }
    }

    public void insertFirst(int data){
        Node node = new Node( );
        node.data= data;
        node.next = null;
        node.next = head;
        head = node;

    }

    public void insertAt(int index, int data){
        Node node=new Node();
        node.data = data;
        node.next= null;

        if(index ==0){
            insertFirst(data);
        }else{
        Node n = head;
        for(int i = 0; i<index-1; i++){
            n = n.next;

        }
        node.next = n.next;
        n.next = node;
    }
}
    public void delete(int index){
        if(index == 0){
            head= head.next; 

        }else{
            Node n= head;
            Node n1 = null;
            for(int i= 0; i<index-1;i++){
                n= n.next;

            }
            n1 = n.next;
            n.next = n1.next;
            System.out.println("deleted node at index "+ index+" and data " + n1.data);
        }
    

    }

    public void reversePrint(){
        Node curr = head;
        Node pre = null;
        Node next = null;

        while(curr!=null){
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr= next;
        }
        while(pre.next!=null){
            head = pre;
            System.out.print(pre.data +" ");
            pre = pre.next;

        }
        System.out.println(pre.data);

    }
    public void show(){
        Node node = head;

        while(node.next!=null){
            System.out.print(node.data+" ");
            node = node.next;
        }
        System.out.println(node.data);
    }
    
}