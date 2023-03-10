package org.example;

import java.util.Stack;
import java.util.StringTokenizer;

public class Polynomial {
    StringTokenizer st;
    String str;
    int number = 0;
    String[] arr;
    String[] ch = {"+", "-", "*", "/"};
    char[] round = {};

    public Polynomial(String str) {
        st = new StringTokenizer(str);
    }
    public int calc() {
        Stack<String> operator = new Stack<>();
        Stack<Integer> operand = new Stack<>();
        int sum = 0;
        String token;
        while(st.hasMoreTokens()) {
            token = st.nextToken();
            if (token.equals("*")) {
                operator.push(token);
            } else if (token.equals("+")) {
                operator.push(token);
            } else {
                operand.push(Integer.valueOf(token));
                if (!operator.isEmpty()) {
                    String op = operator.pop();
                    if  (op.equals("*")) {
                        int pop = operand.pop();
                        sum = pop * operand.pop();
                        operand.push(sum);
                    }
                }
            }
        }
        while (true) {
            if (operator.isEmpty()) break;
            String op = operator.pop();
            int pop = operand.pop();

            if (op.equals("+")) {
                sum = operand.pop() + pop;
                operand.push(sum);
            }
        }
        return sum;
    }
}