package com.company;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Ola seja bem vindo Voce possui conta no nosso sistema ou deseja se cadastrar?");
        System.out.println("(1) Cadastrar");
        System.out.println("(2) Login");
        Integer escolha = Scanner.nextInt();

        if (escolha == 1){
            System.out.println("Digite seu nome aqui:");
            String nome = Scanner.next();
            System.out.println("Digite seu email:");
            String email = Scanner.next();
            System.out.println("Digite sua senha aqui");
            Integer senha = Scanner.nextInt();
            JOptionPane.showMessageDialog(null,"Cadastro enviado!");
        }
        if (escolha == 2){
            System.out.println("Digite seu nome ");
            String nome = Scanner.next();
            System.out.println("Digite sua senha ");
            Integer senhaLogin = Scanner.nextInt();

            JOptionPane.showMessageDialog(null,"Estamos lhe redirecionando");

        }
    }
}