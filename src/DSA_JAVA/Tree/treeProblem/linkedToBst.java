// import java.util.LinkedList;

// public class linkedToBst {
//     public TreeNode sortedListToBST(ListNode head) {
//         List<Integer> l = new ArrayList<>();
        
//         while(head!=null){
//             l.add(head.val);
//             head = head.next;
//         }
            
            
//          return solve(l,0,l.size()-1);
//     }
//     static TreeNode solve(List<Integer> l,int i,int j){
//         if(i>j) return null;
        
//             int mid = (j-i)/2+i;
//         TreeNode node = new TreeNode(l.get(mid));
//         node.left= solve(l,i,mid-1);
//         node.right = solve(l,mid+1,j);
        
//         return node;
//     }


//     // public TreeNode sortedListToBST(ListNode head) {
//     //     return solve(head);
         
//     //  }
//     //  static TreeNode solve(ListNode head){
//     //      if(head==null)
//     //           return null;
         
//     //      ListNode fast = head;
//     //      ListNode slow = head;
//     //      ListNode pre = null;
         
//     //      while(fast.next!=null && fast.next.next!=null){
//     //          pre= slow;
//     //          fast = fast.next.next;
//     //          slow = slow.next;
//     //      }
//     //     if(pre!=null)
//     //      pre.next = null; 
//     //     else
//     //      head = null;
//     //      TreeNode node = new TreeNode(slow.val);
//     //      node.left = solve(head);
//     //      node.right = solve(slow.next);
         
//     //      return node;
//     //  }

//     public static void main(String[] args) {      //[-10,-3,0,5,9]
//         // LinkedList LL = new LinkedList<>();
        
//     }
// }
