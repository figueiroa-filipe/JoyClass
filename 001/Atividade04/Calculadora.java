import java.util.Scanner;

public class Calculadora {
    /*
    Faça uma função calculadora de dois números com três parâmetros: os dois primeiros serão os números da operação e o terceiro será a entrada que definirá a operação a ser executada. Considera a seguinte definição:
    1. Soma
    2. Subtração
    3. Multiplicação
    4. Divisão

    Caso seja inserido um número de operação que não exista, o resultado deverá ser 0.
 */
    public static void main(String[] args) {
        operacao();
    }

    public static void operacao(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        double a = sc.nextDouble();
        System.out.print("Digite o segundo numero: ");
        double b = sc.nextDouble();
        System.out.println("=".repeat(25));
        System.out.println("Operações");
        System.out.println("1. Soma");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        System.out.print("Qual operação deseja realizar ? ");
        int escolha = sc.nextInt();
        System.out.println();

        switch (escolha) {
            case 1:
                System.out.println(soma(a, b));
                break;
            case 2:
                System.out.println(subtracao(a, b));
                break;
            case 3:
                System.out.println(multiplicacao(a, b));
                break;
            case 4:
                System.out.println(divisao(a, b));
                break;
            default:
                System.out.println(0);
        }
    }

    private static double multiplicacao(double a, double b) {
        return a * b;
    }

    private static double divisao(double a, double b){
        if (b == 0) return 0;
        return a / b;
    }

    private static double soma(double a, double b){
        return a + b;
    }

    private static double subtracao(double a, double b){
        return a - b;
    }


}
