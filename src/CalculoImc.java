import java.util.Scanner;

public class CalculoImc {
    public static void main(String[] args) {
        // ENTRADA
        Scanner scanner = new Scanner(System.in);

        // 1- pedir para o usuário o seu peso
        System.out.println("Informe o seu peso em quilogramas");
        double peso = scanner.nextDouble();

        // 2- pedir para o usuário a sua altura em metros
        System.out.println("Informe sua altura em metros");
        double altura = scanner.nextDouble();

        // PROCESSAMENTO
        // 3- calcular o imc
        double imc = peso / (altura * altura);

        // SAÍDA
        // 4- imprime o resultado do IMC
        System.out.println("Seu IMC é:" + imc);

        //Tabela de informações IMC
        System.out.printf("\nIMC <18,5kg/m2 - baixo peso \nIMC >18,5 até 24,9kg/m2 - eutrofia (peso adequado) \nIMC ≥25 até 29,9kg/m2 - sobrepeso. \nIMC >30,0kg/m2 até 34,9kg/m2 - obesidade grau 1.\n");

        scanner.close();

    }
}
