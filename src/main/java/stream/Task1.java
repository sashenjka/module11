package stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Task1 {
    public static void main(String[] args) {
        List<String> names = List.of("Ivan", "John", "Peter", "Mark", "Alice");

        String result = IntStream.range(0, names.size())
                .filter(i -> i % 2 == 0)
                .mapToObj(i -> (i + 1) + ". " + names.get(i))
                .collect(Collectors.joining(", "));

        System.out.println(result);
    }
}





