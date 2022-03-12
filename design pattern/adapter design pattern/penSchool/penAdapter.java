package penSchool;

public class penAdapter implements pen {

    pilotpen pp = new pilotpen();
    @Override
    public void write(String str) {
        pp.mark(str);
    }
    
}
