
import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;
import java.util.Random; /**
         *
         * @author jonab
         */

public class main {

    public static void main(String[] args) {
        Random r = new Random();
        List<Integer> integerList = new ArrayList();
        for (int i = 0; i < 1000; i++) {
            integerList.add(r.nextInt(1000));
        }
        List<Integer> sortedList = integerList.stream().distinct().sorted().collect(Collectors.toList());
        for (int i = 0; i < sortedList.size(); i++) {
            System.out.println(sortedList.get(i));
        }

    }
}
