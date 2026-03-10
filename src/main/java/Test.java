import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {

        // primitive array to list:
        int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Arrays.stream(number).boxed().toList();
        // java 8 fibonacci
        Stream.iterate(new int[]{0,1}, n-> n[0] <14,n -> new int[]{n[1], n[0]+n[1]})
                .map(n->n[0])
                .forEach(System.out::println);
        System.out.println("==============================================================================");
        // sum all fibonacci
        int sum = Stream.iterate(new int[]{0,1}, n -> new int[]{n[1], n[0]+n[1]})
                .limit(20)
                .map(n->n[0])
                .reduce(0,Integer::sum);
        System.out.println(sum);
        List<String> list = Arrays.asList("java", "python");

        list.stream()
                .flatMap(s -> Arrays.stream(s.split("")))
                .forEach(System.out::println);


        Map<Integer, String> map = new HashMap<>();
        map.put(1, "linode");
        map.put(2, "heroku");
        map.put(3, "aws");
        map.put(11, "linode");

        //Map -> Stream -> Filter -> String
        String result1 = map.values().stream()
                .filter("linode"::equals)
                .collect(Collectors.joining(","));
        System.out.println(result1);

        List<String> list2 = Arrays.asList("Java", "Node", "JavaScript", "Rust", "Go");
        IntStream.range(0, list.size()).forEach(x -> System.out.println(x+" "+list.get(x)));

        String[] s1 = new String[]{"a", "b", "c"};
        String[] s2 = new String[]{"d", "e", "f"};
        String[] s3 = new String[]{"g", "h", "i"};

        //join object type array
        String[] result = Stream.of(s1, s2, s3).flatMap(Stream::of).toArray(String[]::new);
        System.out.println(Arrays.toString(result));

    }
}
