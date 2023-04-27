package DA;
import java.util.Stack;
import java.util.*;
public class InfixToPostfixConverter {
    public static String evaluateInfixToPostfix(String infix) {
        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < infix.length(); i++) {
            char c = infix.charAt(i);
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (stack.peek() != '(') {
                    result.append(stack.pop());
                }
                stack.pop();
            } else if (isOperator(c)) {
                while (!stack.isEmpty() && precedence(c) < precedence(stack.peek())) {
                    result.append(stack.pop());
                }
                stack.push(c);
            } else if (!Character.isWhitespace(c)) { // operand variable
                result.append(c);
            } else {
                // ignore characters like whitespaces etc
            }
        }
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        return result.toString();
    }

    private static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '^';
    }

    private static int precedence(char c) {
        switch (c) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(evaluateInfixToPostfix("b-c*a+(d*e-f)/g"));                      // AB+
        System.out.println(evaluateInfixToPostfix("A+B*(C^D-E)"));              // ABCD^E-*+
        System.out.println(evaluateInfixToPostfix("A+(B*C-(D/E-F)G)*H"));      // ABC*DE/F-G-H*+
    }
}
