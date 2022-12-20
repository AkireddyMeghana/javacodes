import org.example.LambdaJava;

import java.util.function.BiPredicate;
import java.util.function.Supplier;

public class Intreface {
    public static void main(String []args ){
        LambdaJava lb = (a,b) -> {
            if (a > b) {
                return a;
            } else {
                return b;
            }
        };
        BiPredicate<Integer, Integer >biPredicate=(a,b)->a>b;
        System.out.println("if a>b its true:-"+biPredicate.test(5,7));

       // Supplier<double>randomValue
        System.out.println("comparing of the number is" + lb.add(15,5));
    }
}
