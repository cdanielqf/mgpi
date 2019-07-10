package ing_sw_2019;


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
            System.out.println("La suma de todos los numeros hasta " + num + " es");
            System.out.println(suma(num));
        } catch (NumberFormatException e) {
            System.out.println("ngrese un número");
        }
    }

    static int suma(int n) {
        if (n <= 0) {
            return 0;
        } else {
            return n + suma(n - 1);
        }
    }

}
