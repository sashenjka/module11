package stream;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        String[] array = {"1, 2, 0", "4, 5"};

        String sortedNumbers = Arrays.stream(array)
                .flatMap(str -> Arrays.stream(str.split(",\\s*")))
                .map(String::trim)
                .mapToInt(Integer::parseInt)
                .sorted()
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(", "));

        System.out.println("\"" + sortedNumbers + "\"");
    }
}

