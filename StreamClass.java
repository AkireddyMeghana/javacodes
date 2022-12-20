import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamClass {
    public static void main(String[] args){
        List<String> NewList= new ArrayList<>();
        NewList.add("anu");
        NewList.add("john");
        NewList.add("megha");
        NewList.add("sitha");
        Stream<String> s1=NewList.stream();
        List<String> s2= s1.filter(a->a.startsWith("s")).map(q->q+" Moris").sorted().collect(Collectors.toList());
        System.out.println(s2);


    }
}
