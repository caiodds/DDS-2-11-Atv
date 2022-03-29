import java.sql.SQLOutput;
import java.util.Scanner;

public class Atv8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual preco do primeiro produto: ");
        Double precoProduto = scanner.nextDouble();
        System.out.println("Qual o preco do segundo produto: ");
        Double precoDoSegundoProduto = scanner.nextDouble();
        System.out.println("Qual preco do terceiro produto: ");
        Double precoDoTerceiroProduto = scanner.nextDouble();

        if (precoProduto < precoDoSegundoProduto && precoProduto < precoDoTerceiroProduto) {
            System.out.println("Indicamos esse produto pelo menor preco "+precoProduto);
        }
    }
}
