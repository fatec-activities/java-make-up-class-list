import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Utils.consoleClear();
        Scanner input = new Scanner(System.in);

        int option;
        do {
            printMenu();

            System.out.print("Escolha uma opção: ");
            option = input.nextInt();

            System.out.println();

            switch (option) {
                case 1:
                    rectangleArea(input);
                    break;
                case 2:
                    circleArea(input);
                    break;
                case 3:
                    triangleArea(input);
                    break;
                case 4:
                    circlePerimeter(input);
                    break;
                case 5:
                    hypotenuse(input);
                    break;
                case 0:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

            System.out.println();
            System.out.println("Pressione ENTER para continuar...");
            input.nextLine();
            input.nextLine();
            Utils.consoleClear();

        } while (option != 0);

        input.close();
    }

    private static void printMenu() {
        System.out.println("====================================");
        System.out.println("CALCULADORA GEOMÉTRICA");
        System.out.println("====================================");
        System.out.println("1 - Área do Retângulo");
        System.out.println("2 - Área do Círculo");
        System.out.println("3 - Área do Triângulo");
        System.out.println("4 - Perímetro do Círculo");
        System.out.println("5 - Hipotenusa de Triângulo Retângulo");
        System.out.println("0 - Sair");
        System.out.println("====================================");
    }

    private static void rectangleArea(Scanner input) {
        System.out.print("Digite a base: ");
        double base = input.nextDouble();
       
        System.out.print("Digite a altura: ");
        double height = input.nextDouble();

        if (base <= 0 || height <= 0) {
            System.out.println("Erro: dimensões devem ser maiores que zero.");
            return;
        }

        double area = Geometry.rectangleArea(base, height);
        System.out.printf("Área do retângulo: %.2f%n", area);
    }

    private static void circleArea(Scanner input) {
        System.out.print("Digite o raio: ");
        double radius = input.nextDouble();

        if (radius <= 0) {
            System.out.println("Erro: raio deve ser maior que zero.");
            return;
        }

        double area = Geometry.circleArea(radius);
        System.out.printf("Área do círculo: %.2f%n", area);
    }

    private static void triangleArea(Scanner input) {
        System.out.print("Digite a base: ");
        double base = input.nextDouble();
       
        System.out.print("Digite a altura: ");
        double height = input.nextDouble();

        if (base <= 0 || height <= 0) {
            System.out.println("Erro: dimensões devem ser maiores que zero.");
            return;
        }

        double area = Geometry.triangleArea(base, height);
        System.out.printf("Área do triângulo: %.2f%n", area);
    }

    private static void circlePerimeter(Scanner input) {
        System.out.print("Digite o raio: ");
        double radius = input.nextDouble();

        if (radius <= 0) {
            System.out.println("Erro: raio deve ser maior que zero.");
            return;
        }

        double perimeter = Geometry.circlePerimeter(radius);
        System.out.printf("Perímetro do círculo: %.2f%n", perimeter);
    }

    private static void hypotenuse(Scanner input) {
        System.out.print("Digite o cateto A: ");
        double a = input.nextDouble();

        System.out.print("Digite o cateto B: ");
        double b = input.nextDouble();

        if (a <= 0 || b <= 0) {
            System.out.println("Erro: catetos devem ser maiores que zero.");
            return;
        }

        double hyp = Geometry.hypotenuse(a, b);
        System.out.printf("Hipotenusa: %.2f%n", hyp);
    }
}