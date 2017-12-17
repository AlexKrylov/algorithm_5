import java.util.*;

public class Main {

    public static void main(String[] args) {

        String s = "[2/{5*(4+7)}]";
        System.out.println(brackets(s));
    }
    //Задача 1 перевод из 10 в 2 систему счисления с использованием стека
    public static int convert10To2 (int number) {

        return number;
    }
    //Задача 3 проверка на правильность скобочной структуры
    public static boolean brackets(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == ')' || s.charAt(i) == '{' || s.charAt(i) == '}' || s.charAt(i) == '[' || s.charAt(i) == ']')
                stack.push(s.charAt(i));
        }
        int counter = 0;
        System.out.println(stack);
        for (int i = 0; i < stack.size(); i++) {
            if (stack.get(i) == '(' || stack.get(i) == '{' || stack.get(i) == '[') counter++;
            else if (stack.get(i) == ')' || stack.get(i) == '}' || stack.get(i) == ']' && --counter < 0) break;
            System.out.println(counter);
            if (counter > 0) return true;
        }
        return false;
    }
}