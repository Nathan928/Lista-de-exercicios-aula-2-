import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o ano que você nasceu");
        int anoNascimento = sc.nextInt();
        System.out.println("O ano de seu nascimneto é: " + anoNascimento);
        System.out.println("E qual seu nome cidadão?");
        sc.nextLine();
        String nome = sc.nextLine();
        System.out.println("Beleza seu nome é: " + nome);

        System.out.println("Quantas horas você trabalhou esse mês");
        double horas = sc.nextDouble();
        System.out.println("Você trabalhou " + horas + " horas nesse mês");

        System.out.println("Qual o valor da sua hora");
        double valor = sc.nextDouble();
        System.out.println("O valo da sua hora é " + valor);

        double salario = horas * valor;

        System.out.println("-------------------------FORMULÁRIO-----------------------------");
        System.out.println("Nome: " + nome);
        System.out.println("Ano de nascimento " + anoNascimento);
        System.out.println("Salario do mês: " + salario);
        System.out.println("----------------------------------------------------------------");
    }
}