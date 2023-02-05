import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char operator;
        Double x, y, result;

        Scanner input = new Scanner(System.in);

        System.out.println("Choose an operator: +, -, *, or /:");
        operator = input.next().charAt(0);

        System.out.println("Ievadi skaitli X:");
        x = input.nextDouble();

        System.out.println("Ivedi skaitli Y:");
        y = input.nextDouble();

        switch (operator) {


            case '+':
                result = x + y;
                System.out.println(x + " + " + y+ " = " + result);
                break;

            case '-':
                result = x - y;
                System.out.println(x + " - " + y + " = " + result);
                break;

            case '*':
                result = x * y;
                System.out.println(x + " * " + y + " = " + result);
                break;

            case '/':
                result = x / y;
                System.out.println(x+ " / " + y + " = " + result);
                break;

        }

        input.close();
    }

}

