import java.util.Scanner;

public class Atv7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero:");
        Integer numero01 = scanner.nextInt();
        System.out.println("Digite o segundo numero:");
        Integer numero02 = scanner.nextInt();
        System.out.println("Digite o terceiro numero:");
        Integer numero03 = scanner.nextInt();

        if (numero01 > numero02 && numero01 > numero03){
            System.out.println("o numero maior é o " + numero01);
        }
        if (numero02 > numero03 && numero02 > numero01){
            System.out.println("O maior numero é o "+numero02);
        }
        if (numero03 > numero01 && numero03 > numero02){
            System.out.println("o maior numero é "+numero03);
        }
        if (numero01 < numero02 && numero01 < numero03){
            System.out.println("O menor nuemro é "+numero01);
        }
        if (numero02 < numero03 && numero02 < numero01){
            System.out.println("O menor numero é "+numero02);
        }
        if (numero03 < numero02 && numero03 < numero01){
            System.out.println("o menor numero é "+numero03);
        }
    }
}
