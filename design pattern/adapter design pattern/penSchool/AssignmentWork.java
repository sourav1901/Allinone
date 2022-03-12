package penSchool;
public class AssignmentWork {
    private pen p;
    public pen getP() {
        return p;
    }
    public void setP(pen p) {
        this.p = p;
    }
    public void writeAssignment(String str){
        p.write(str);
    }
}
