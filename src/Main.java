import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valorFixo = 120;

        System.out.println("Nome do carro: ");
        String nomeCarro = scanner.nextLine();

        System.out.println("Qual o preço da Gasolia: ");
        double precoGasolina = scanner.nextDouble();

        System.out.println("Qual o preço do Etanol: ");
        double precoEtanol = scanner.nextDouble();

        System.out.println("Seu carro faz quantos km com 1 litro de Gasolina: ");
        double kmPorLitroGasolina = scanner.nextDouble();

        System.out.println("Seu carro faz quantos km com 1 litro de Etanol? ");
        double kmPorLitroEtanol = scanner.nextDouble();

        double litrosDeGasolinaComValorFixo = valorFixo / precoGasolina;
        double litroDeEtanolComValorFixo = valorFixo / precoEtanol;

        double kmTotalComGasolina = litrosDeGasolinaComValorFixo * kmPorLitroGasolina;
        double  kmTotalComEtanol = litroDeEtanolComValorFixo * kmPorLitroEtanol;

        System.out.printf("%.2f km com gasolina.%n", kmTotalComGasolina);
        System.out.printf("%.2f km com etanol.%n ", kmTotalComEtanol);

        if(kmTotalComGasolina > kmTotalComEtanol){
            System.out.println("A vantagem do " + nomeCarro + " está com a Gasolina");
        }  else {
            System.out.println("A vantagem do " + nomeCarro + " está com o Etanol.");
        }

    }
}
