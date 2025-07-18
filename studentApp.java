import java.util.*;
import java.util.Collections;
public class studentApp {
    public static void main(String[] args) {
        List<Student>l=new ArrayList<Student>();
        l.add(new Student(1001,"Dinga"));
        l.add(new Student(3001,"Dingi"));
        l.add(new Student(4001,"Sundra"));
        l.add(new Student(2001,"Sundri"));
        for (Student s : l) {
            System.out.println(s);
        }
        Collections.sort(l);  


        for (Student s : l) {
            System.out.println(s);
        }

}
}
