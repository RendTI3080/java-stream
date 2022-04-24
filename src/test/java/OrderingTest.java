import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;

public class OrderingTest {

    @Test
    void orderingTest(){
        List.of("Rendy","Eka").stream().sorted().forEach(System.out::println);

        List.of("Rendy","Eka").stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
