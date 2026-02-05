import java.util.Scanner;

public class Calculadora {
    /*
  Faça uma função calculadora que os números e as operações serão feitas pelo usuário. O código deve ficar rodando infinitamente até que o usuário escolha a opção de sair. No início, o programa mostrará a seguinte lista de operações:
  
  1: Soma
  2: Subtração
  3: Multiplicação
  4: Divisão
  0: Sair
  
  Digite o número para a operação correspondente e caso o usuário introduza qualquer outro, o sistema deve mostrar a mensagem “Essa opção não existe” e voltar ao menu de opções.
  
  Após a seleção, o sistema deve pedir para o usuário inserir o primeiro e segundo valor, um de cada. Depois precisa executar a operação e mostrar o resultado na tela. Quando o usuário escolher a opção “Sair”, o sistema irá parar.
  
  É necessário que o sistema mostre as opções sempre que finalizar uma operação e mostrar o resultado. 
 */
    public static void main(String[] args) {
        operacao();
    }

    public static void operacao(){
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("=".repeat(25));
            System.out.println("Operações");
            System.out.println("1. Soma");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("0. Sair");
            System.out.print("Qual operação deseja realizar ? ");
            int escolha = sc.nextInt();
            if(escolha == 0) break;
            System.out.print("Digite o primeiro numero: ");
            double a = sc.nextDouble();
            System.out.print("Digite o segundo numero: ");
            double b = sc.nextDouble();
            System.out.println();
            
            if (escolha == 1) System.out.println("Resultado: "+soma(a,b));
            else if (escolha == 2) System.out.println("Resultado: "+subtracao(a,b));
            else if (escolha == 3) System.out.println("Resultado: "+multiplicacao(a,b));
            else if (escolha == 4) System.out.println("Resultado: "+divisao(a,b));
            else System.out.println("Essa opção não existe");
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
