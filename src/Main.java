import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String words = "yourapp the quick brown fox jumps over the lazy dog";
        System.out.println("Top 10: ");
        Arrays.stream(words.split(" "))
                .collect(Collectors.groupingBy(s->s,Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(java.util.Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(10)
                .forEach((e -> System.out.println(e.getKey() + " - " + e.getValue())));

    }

}