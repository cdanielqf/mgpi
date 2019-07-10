package ing_sw_2019;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        String n = scanner.nextLine();
        try {
            int num = Integer.parseInt(n);
            switch (num % 2) {
                case 0:
                    System.out.println("El número es par");
                    break;
                case 1:
                    System.out.println("El número es impar");
                    break;
                default:
                    System.out.println("El número es racional");
                    break;
            }
        } catch (NumberFormatException e) {
            System.out.println("ngrese un número");
        }
    }

}
