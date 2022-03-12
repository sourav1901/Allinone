public class immutable{
    public static void main(String[] args) {

        // Address address  = new Address("e","d","d");
        Address address2  = new Address("bhopal","mp","India");
        // student s = new student("souraav",1 ,address);
        student s1 = new student("souraavvvvvvvvvvvv",2 ,address2);
        address2.setCity("ssssssssssssssssssss");
        
       
       System.out.println(s1);
    //    System.out.println(s2);


    }
}