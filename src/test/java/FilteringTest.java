import org.junit.jupiter.api.Test;

import java.util.List;

public class FilteringTest {

    @Test
    void filterTest(){
        List.of("Rendy", "Eka", "Febriyanto").stream()
                .filter(value -> value.length() > 8)
                .forEach(System.out::println);
    }

    @Test
    void filterDistinctTest(){
        List.of("Rendy", "Eka", "Febriyanto","Eka","Budi").stream()
                .distinct()
                .forEach(System.out::println);
    }
}
