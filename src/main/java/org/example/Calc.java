package org.example;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Calc {
    public static int run(String exp) {
        // 단일항이 입력되면 바로 리턴
        if (!exp.contains(" ")) return Integer.parseInt(exp);

        boolean needToMulti = exp.contains("*");
        boolean needToPlus = exp.contains("+");

        boolean needToCompound = needToMulti && needToPlus;
        if (needToCompound) {
            // 복합이면 더하기로 나눠봐
            String[] bits = exp.split("\\+");

            String newExp = Arrays.stream(bits)
                    .mapToInt(Calc::run)// 각각의 요소에 대해 Calc.run(e);
                    .mapToObj(e -> e + "")
                    .collect(Collectors.joining(" + "));

            return run(newExp);
        }
        else if (needToPlus) {
            exp = exp.replace("- ", "+ -");

            String[] bits = exp.split("\\+");
            int sum = 0;

            for (int i = 0; i < bits.length; i++) {
                sum += Integer.parseInt(bits[i]);
            }
            return sum;
        }
        throw new RuntimeException("올바른 계산식이 아닙니다.");
    }
}
