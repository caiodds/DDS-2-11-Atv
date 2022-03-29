import java.util.Scanner;

public class Atv6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero:");
        Integer numero1 = scanner.nextInt();
        System.out.println("Digite o segundo numero:");
        Integer numero2 = scanner.nextInt();
        System.out.println("Digite o terceiro numero:");
        Integer numero3 = scanner.nextInt();



        if (numero1 > numero2){
            System.out.println("o numero"+numero1 + " é maior que " +numero2);
        }
        if (numero2 > numero3){
            System.out.println("o numero "+numero2 + " é maior que "+numero3);
        }
        if (numero3 > numero1){
            System.out.println("o numero "+ numero3 + " é maior que o "+numero1);
        }
    }
}
