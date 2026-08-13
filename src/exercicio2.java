import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero");
        int num1 = sc.nextInt();
        System.out.println("Digite seu segundo numero");
        int num2 = sc.nextInt();

        int soma = num1 + num2;
        int subtraçao = num1 - num2;
        int divisao = num1 / num2;
        int multiplicaçao = num1 * num2;

        System.out.println("o resultado dos dois numeros é: " + soma);
        System.out.println("o resultado dos dois numeros é: " + subtraçao);
        System.out.println("o resultado dos dois numeros é: " + divisao);
        System.out.println("o resultado dos dois numeros é: " + multiplicaçao);


    }
}
