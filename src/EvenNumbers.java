import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumbers {

    public static void main(String[] args) {
final   List<Integer> inputNumbers = List.of(2, 5, 4, 2, 3, 8);
        List<Integer> evenNumbers = new ArrayList<>();

                evenNumbers=inputNumbers;
                evenNumbers = evenNumbers.stream()
                .filter (number -> number % 2==0)
                .collect(Collectors.toList());


       /* for (Integer number: inputNumbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }*/

        System.out.println(evenNumbers);
    }
}