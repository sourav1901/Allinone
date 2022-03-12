public class student {
    final String name;
    final int id;
    final Address address;
     
    


    public student(String name, int id, Address address) {
        this.name = name;
        this.id = id;
        this.address = address;
    }


    public String getName() {
        return name;
    }

    

       public int getId() {
        return id;
    }


    @Override
    public String toString() {
        return "student [ id=" + id + ", name= " + name +", " + address + "]";
    }



   
    

}
