package reactor;

import reactor.core.publisher.Flux;

import java.util.Arrays;
import java.util.List;

public class ReactorHh {

    private static List<String> words = Arrays.asList(
            "the",
            "quick",
            "brown",
            "fox",
            "jumped",
            "over",
            "the",
            "lazy",
            "dog"
    );

    public void simpleCreation() {
        Flux<String> manyWords = Flux.fromIterable(words).map((i) -> {
            try {
                Thread.sleep(10000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "";
        });
        Flux<String> fewWords = Flux.just("Hello", "World");

        manyWords.subscribe(System.out::println);
        fewWords.subscribe(i ->
        {
            System.out.println(i);
        });
    }

    public static void main(String[] args) throws Exception {
        new ReactorHh().simpleCreation();
//        System.out.println(123);
    }
}
