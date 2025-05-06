package Exercise2;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);

        System.out.println(list);

        ArrayList<Integer> reverseList = new ArrayList<>();

        ListIterator<Integer> iterador = list.listIterator();

        while (iterador.hasNext()) {
            iterador.next();
        }

        while (iterador.hasPrevious()) {
            reverseList.add(iterador.previous());
        }

        System.out.println(reverseList);
    }
}
