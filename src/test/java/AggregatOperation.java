import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;

public class AggregatOperation {

    // operasi untuk menghitung

    @Test
    void aggregatTest(){
        List.of(1,2,3,4,5).stream().min(Comparator.naturalOrder()).ifPresent(System.out::println);
        List.of(1,2,3,4,5).stream().max(Comparator.naturalOrder()).ifPresent(System.out::println);
        Long item = List.of(1,2,3,4,5).stream().count();
        System.out.println(item);
    }

    @Test
    void sumTest(){
        Integer sum = List.of(1,2,3).stream().reduce(0,(item1,item2) -> item1 + item2);
        System.out.println(sum);
   }
}