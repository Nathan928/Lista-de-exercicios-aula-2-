import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite seu nome");
        String nome = sc.nextLine();
        System.out.println("Qual a sua idade");
        int idade = sc.nextInt();
        System.out.println("qual a sua altura");
        double altura = sc.nextDouble();
        System.out.println("O seu nome é: " + nome + "    | A sua idade é: " + idade + "    | A sua altura é: " + altura);
    }
}
