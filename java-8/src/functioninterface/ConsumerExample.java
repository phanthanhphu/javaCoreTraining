package functioninterface;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ConsumerExample {
    public static void main(String[] args){
        int a = 4;
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String name) {
                System.out.println("Hello, " + name);
            }
        };
        consumer.accept("Java");

        Supplier<Double> generate = () -> Math.random();
        System.out.println(generate.get());

        Function<String, Integer> f = str->str.length();
        System.out.println(f.apply("John"));

        Predicate<Integer> checkAge = age->age>3;
        System.out.println(checkAge.test(a));

    }
}
