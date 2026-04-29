import java.util.*;

public class GenericSearch {
    public static <T> boolean searchElement(LinkedList<T> list, T element) {
        return list.contains(element);
    }

    public static void main(String[] args) {
        LinkedList<Integer> rollNumbers = new LinkedList<>();
        rollNumbers.add(101);
        rollNumbers.add(102);
        rollNumbers.add(103);

        LinkedList<String> names = new LinkedList<>();
        names.add("Amit");
        names.add("Neha");
        names.add("Riya");

        System.out.println(searchElement(rollNumbers, 102));
        System.out.println(searchElement(rollNumbers, 105));

        System.out.println(searchElement(names, "Neha"));
        System.out.println(searchElement(names, "Raj"));
    }
}
