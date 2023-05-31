package stream;

import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        List<String> names = List.of("Ivan", "John", "Peter", "Michael", "David");

        List<String> sortedNames = names.stream()
                .map(String::toUpperCase)
                .sorted((a, b) -> b.compareTo(a))
                .collect(Collectors.toList());

        sortedNames.forEach(System.out::println);
    }
}

