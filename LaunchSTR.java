
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class LaunchSTR 
{
    public static void main(String[] args) 
    {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        Stream<Integer> streamData = list.stream();

       // Predicate<Integer> pre = i -> i%2==0;
    

        Stream<Integer> finalStream = streamData
                .filter(n-> n%2==0)
                .sorted() // Sorting in natural order
                .map(n -> n * 2);

        finalStream.forEach(n -> System.out.println(n));
    }
}

            
    
