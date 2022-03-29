import java.util.Scanner;

public class Atv10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite em qual turno voce estuda? ");
        char turno = scanner.nextLine().charAt(0);

        boolean vespertino = turno == 'v';
        boolean matutino = turno ==  'M';
        boolean noturno = turno == 'n';

        if (vespertino){
            System.out.println("Bom Dia!");
        }
        if (matutino){
            System.out.println("Boa tarde!");
        }
        if (noturno){
            System.out.println("Boa noite!");
        }
    }
}
