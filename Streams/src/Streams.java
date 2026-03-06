import java.util.List;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args){
        // create a list and filter even number from list
        List<Integer> list1=List.of(2,3,15,22);
        List<Integer> newlist=list1.stream().filter(i->i%2==0).collect(Collectors.toList());
        newlist.forEach(System.out::println);
    }
}
