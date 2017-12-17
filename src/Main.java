import java.util.*;

public class Main {

    public static void main(String[] args) {
        convert10To2(8);
        String s = "[2/{5*(4+7)}]";
        System.out.println(brackets(s));
    }

    //Задача 1. Перевод из 10 в 2 систему счисления с использованием стека
    public static Stack convert10To2(int number) {
        int temp;
        Stack<Integer> stack = new Stack<>();
        while (number != 0) {
            temp = number % 2;
            number = number / 2;
            stack.push(temp);
        }
        while (!stack.empty()) {
            System.out.print(stack.pop());
        }
        System.out.println();
        return stack;
    }

    //Задача 3. Проверка на правильность скобочной структуры
    public static boolean brackets(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == ')' || s.charAt(i) == '{' || s.charAt(i) == '}' || s.charAt(i) == '[' || s.charAt(i) == ']')
                stack.push(s.charAt(i));
        }
        int counter = 0;
        for (int i = 0; i < stack.size(); i++) {
            if (stack.get(i) == '(' || stack.get(i) == '{' || stack.get(i) == '[') counter++;
            else if (stack.get(i) == ')' || stack.get(i) == '}' || stack.get(i) == ']' && --counter < 0) break;
            if (counter > 0) return true;
        }
        return false;
    }
}