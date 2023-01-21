import java.util.ArrayList;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> secondNames = new ArrayList<>();
        secondNames.add("Williams");
        secondNames.add("Peters");
        secondNames.add("Gibson");
        secondNames.add("Martin");
        secondNames.add("Jordan");
        secondNames.add("Jackson");
        secondNames.add("Grant");
        secondNames.add("Davis");

        Stream<String> stream = secondNames.stream();
        stream.filter(s -> s.charAt(0) == 'J').forEach(System.out::println);


    }
}
