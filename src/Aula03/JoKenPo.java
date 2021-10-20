package Aula03;

import java.util.Scanner;

public class JoKenPo {

    public static void main(String[] args) {
        int jogador1, jogador2;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Jo Ken Pô");
        System.out.println("");
        System.out.println("1. Pedra");
        System.out.println("2. Papel");
        System.out.println("3. Tesoura");
        System.out.print("Digite a opção desejada: ");

        System.out.println("");
        jogador1 = teclado.nextInt();
        switch (jogador1) {
            case 1:
                System.out.println("Jogador1 escolheu PEDRA");
                break;
            case 2:
                System.out.println("Jogador1 escolheu PAPEL");
                break;
            case 3:
                System.out.println("Jogador1 escolheu TESOURA");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

        jogador2 = (int) (Math.random() * 3 + 1);
        teclado.close();
        switch (jogador2) {
            case 1:
                System.out.println("Jogador2 escolheu PEDRA");
                break;
            case 2:
                System.out.println("Jogador2 escolheu PAPEL");
                break;
            case 3:
                System.out.println("Jogador2 escolheu TESOURA");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

        System.out.println("");
        if (jogador1 == jogador2) {
            System.out.println("Empate!!");
        } else {
            if ((jogador1 == 1 && jogador2 == 3) || (jogador1 == 2 && jogador2 == 1) || (jogador1 == 3 && jogador2 == 2)) {
                System.out.println("Jogador1 venceu!!");
            } else {
                System.out.println("Jogador2 venceu!!");
            }
        }
    }

}
