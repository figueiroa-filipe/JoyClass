import java.time.LocalDate;
import java.util.Scanner;

public class IdadeAtual {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int anoAtual = LocalDate.now().getYear();

        while (true){
            try {
                System.out.print("Digite seu nome completo: ");
                String nomeCompleto = sc.nextLine();
                System.out.print("Digite o seu ano de nascimento: ");
                int anoUsuario = sc.nextInt();
                
                if (!(anoUsuario >= 1922 && anoUsuario <= 2021)) throw new Exception();
                int idade = anoAtual-anoUsuario;

                System.out.println("*".repeat(25));
                System.out.printf("%s, sua idade é %d%n", nomeCompleto, idade);
                System.out.println("*".repeat(25));
                break;
            } catch (Exception e){
                System.out.println("Ano não permitido, Tente novamente!");
                sc.nextLine();
                System.out.println();
            }
        }
        sc.close();
    }
}
