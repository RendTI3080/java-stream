import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GrupStream {

    Stream<String> getStream(){
        return Stream.of("Rendy","Eka");
    }



    @Test
    void grupTest(){
        Map<String, List<String>> data = getStream().
                collect(Collectors.groupingBy(item -> item.length() > 4 ? "Panjang":"Pendek"));

        System.out.println(data);
    }

    @Test
    void partitioningTest(){
        Map<Boolean,List<String>> data = getStream()
                .collect(Collectors.partitioningBy(item -> item.length() > 5));
        System.out.println(data);
    }
}
