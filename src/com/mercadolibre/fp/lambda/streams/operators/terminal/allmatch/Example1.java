package com.mercadolibre.fp.lambda.streams.operators.terminal.allmatch;

import java.util.List;
import java.util.stream.Stream;

public class Example1 {
    public static void main(String[] args) {
        List<String> stringList = List.of("One flew over the cuckoo's nest", "To kill a muckingbird", "Gone with the wind");

        Stream<String> stream = stringList.stream();

        boolean allMatch = stream.allMatch(value -> value.startsWith("One"));

        System.out.println(allMatch);
    }
}
