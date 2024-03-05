import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite a quantidade de casos de teste (N): ");
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.println("Digite os 3 valores reais para o caso de teste #" + (i + 1) + ":");
            double valor1 = sc.nextDouble();
            double valor2 = sc.nextDouble();
            double valor3 = sc.nextDouble();

            double mediaPonderada = (valor1 * 2 + valor2 * 3 + valor3 * 5) / (2 + 3 + 5);

            System.out.printf("Média Ponderada: %.1f%n", mediaPonderada);
        }

        sc.close();
    }
}