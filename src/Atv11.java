import java.util.Scanner;

public class Atv11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o salario do colaborador: R$: ");
        Double salario = scanner.nextDouble();

        boolean novoSalario = salario<=280;
        boolean novoSalario2 = salario<=280&&salario>=700;
        boolean novoSalario3 = salario<=700&&salario>=1500;
        boolean novoSalario4 = salario>=1500;

        if(novoSalario){
        double aumento1 = salario*1.20;
            System.out.print("o seu salario aumentou em 20% e agr estar no valor de: "+aumento1);

        }
        if(novoSalario2){
            double aumento2 = salario*1.15;
            System.out.println("Seu salario aumentou em 15% e agora está no valor de: "+aumento2);
        }
        if (novoSalario3){
            double aumento3 = salario*1.10;
            System.out.println("Seu salario aumentou em 10% e agora está no valor de: "+aumento3);
        }
        if (novoSalario4){
            double aumento4 = salario*1.05;
            System.out.println("O salario aumentou em 5% e agora está no valor de: "+aumento4);
        }

    }

}
