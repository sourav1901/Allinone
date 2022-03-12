
public class Srunner{
    public static void main(String[] args) {

        Stack nums = new Stack();
        nums.push(4);
        nums.show();
        nums.push(4);
        nums.push(44);
        nums.push(43);
        nums.push(43);

        nums.pop();
        
        
        // Dstack nums = new Dstack();
        // Stack nums = new Stack();
        // nums.push(13);
        // nums.push(4);
        // nums.push(44);
        // nums.push(43);
        nums.show();

        // nums.push(43);
        // nums.push(43);
        // nums.push(6);

        System.out.println("Deleted : "+ nums.pop());
        System.out.println("Deleted : "+ nums.pop());
        System.out.println("Deleted : "+ nums.pop());
        System.out.println("Deleted : "+ nums.pop());
        System.out.println("Deleted : "+ nums.pop());
        System.out.println("Deleted : "+ nums.pop());
        System.out.println("Deleted : "+ nums.pop());
        // System.out.println("Deleted : "+ nums.pop());
        // System.out.println("top : "+ nums.peek());
        System.out.println("size is : "+ nums.size());
        // nums.show();
    }
}