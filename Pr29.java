import java.util.*;

public class StudentMarks {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();

        marks.add(78);
        marks.add(85);
        marks.add(92);
        marks.add(66);
        marks.add(88);

        System.out.println("Marks: " + marks);

        int max = Collections.max(marks);
        int min = Collections.min(marks);

        System.out.println("Highest Marks: " + max);
        System.out.println("Lowest Marks: " + min);
    }
}
