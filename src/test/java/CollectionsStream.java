import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionsStream {

    Stream<String> getStream(){
        return Stream.of("Rendy","Eka");
    }

    @Test
    void streamToList(){
        List<String> data = getStream().collect(Collectors.toList());
        List<String> data2 = getStream().collect(Collectors.toUnmodifiableList());
    }

    @Test
    void streamToMap(){
        Map<String,Integer> data = getStream().collect(Collectors.toMap(name -> name, String::length));
        System.out.println(data);
    }
}
