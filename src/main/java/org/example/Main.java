package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String str = "1600851475143";
        long n = Long.parseLong(str);
        List<Long> prime = new ArrayList<>();
        long i = 7;
        while (n > 7) {
            if (n % i == 0) {
                prime.add(i);
                n /= i;
            }
            i += 2;
        }

        prime = prime.stream().sorted((e1, e2) -> (int) (e2 - e1))
                        .collect(Collectors.toList());
        System.out.println(prime.get(0));
    }
}
