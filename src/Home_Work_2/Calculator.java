package Home_Work_2;

import java.util.Scanner;

import static java.lang.reflect.Array.getInt;


public class Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main (String[] args) {
        int number1 = getInt();
        int number2 = getInt();
        char operation = getOperation();
        int rezultat = calc(number1, number2, operation);
        System.out.println("Результат: "+rezultat);
    }

    public static int getInt() {
        System.out.println("Введіть число...");
        int number;
        number = scanner.nextInt(); {
    }
        return number;

    }

    public static char getOperation() {
        System.out.println("Введіть операцію...");
        char operation;
        operation = scanner.next().charAt(0); {
    }
        return operation;
    }

    public static int calc(int number1, int number2, char operation) {
        int rezultat;
        switch (operation) {
            case '+':
                rezultat = number1 + number2;
                break;
            case '-':
                rezultat = number1 - number2;
                break;
            case '*':
                rezultat = number1 * number2;
                break;
            case '/':
                rezultat = number1 / number2;
                break;
            default:
                rezultat = calc(number1, number2, getOperation());
        }
        return rezultat;

        }
    }


