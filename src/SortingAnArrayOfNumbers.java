import java.util.Arrays;
import java.util.stream.Collectors;

public class SortingAnArrayOfNumbers {
    public static void main(String[] args) {
        String[] num = {"1, 2, 0", "4, 5"};

        String numbers = Arrays.stream(num)
        .flatMap(s -> Arrays.stream(s.split(", ")))
                .sorted()
                .collect(Collectors.joining(", "));

        System.out.println(numbers);
    }
}
