import java.util.Scanner;

public class Atv9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero ");
        Integer numero01 = scanner.nextInt();
        System.out.println("Digite o segundo numero ");
        Integer numero02 = scanner.nextInt();
        System.out.println("Digite terveiro numero ");
        Integer numero03 = scanner.nextInt();

        if (numero01 < numero02 && numero02 < numero03){
            System.out.println("O menor pro maior "+ numero01 + " " +numero02+ " " +numero03);
        }
    }
}
