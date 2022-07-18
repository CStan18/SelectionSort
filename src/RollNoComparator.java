import java.util.Comparator;

public class RollNoComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Student s1 = (Student) o1;
        Student s2 = (Student) o2;

        return Integer.compare(s1.rollno, s2.rollno);
    }
}
