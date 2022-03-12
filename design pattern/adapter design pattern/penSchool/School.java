package penSchool;
public class School{
    public static void main(String[] args) {
        // pilotpen pp = new pilotpen();
        pen p = new penAdapter();
        AssignmentWork aw = new AssignmentWork();
        aw.setP(p);
        aw.writeAssignment("i am writting assignment");
        
    }



}