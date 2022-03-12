import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        String s = "sourav";
        List<String> l = new ArrayList<>();
        s= new StringBuilder(s).reverse().toString();
        System.out.println(s);
        l.add(s);

    }
}
