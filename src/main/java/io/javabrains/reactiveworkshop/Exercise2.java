package io.javabrains.reactiveworkshop;

import java.io.IOException;

public class Exercise2 {

    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumbersFlux() and ReactiveSources.userFlux()


        // Print all numbers in the ReactiveSources.intNumbersFlux stream

        //Flux<Integer> stream = ReactiveSources.intNumbersFlux();
        //stream.subscribe(element -> System.out.println(element));
        //stream.subscribe(element -> System.out.println("Another One " + element));
        ReactiveSources.intNumbersFlux().subscribe(
                element -> System.out.println(element),
                err -> System.out.println(err.getMessage()),
                () -> System.out.println("Completed")

        );
        // Print all users in the ReactiveSources.userFlux stream
        ReactiveSources.userFlux()
                .subscribe(user -> System.out.println(user));

        System.out.println("Press a key to end");
        System.in.read();
    }

}
