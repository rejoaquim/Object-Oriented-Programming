package Aula01;

import java.util.Scanner;

public class Mesa01 {

    public static void main(String[] args) {

        String nomeCachorro = "Shesheu";
        String nomePeixe = "Nemo";
        String nomeGato = "Snow";

        int idadeCachorro = 2;
        int idadePeixe = 1;
        int idadeGato = 3;

        String cachorroCome = "1kg e meio";
        String peixeCome = "140 gramas";
        String gatoCome = "meio quilo";

        String cachorroSom = "au au";
        String peixeSom = "glub glub";
        String gatoSom = "miau miau";

        System.out.println(nomeCachorro+" tem "+idadeCachorro+" "+"anos "+"come "+cachorroCome+" e faz "+cachorroSom);

        System.out.println(nomePeixe+" tem "+idadePeixe+" "+"ano "+"come "+peixeCome+" e faz "+peixeSom);

        System.out.println(nomeGato+" tem "+idadeGato+" "+"anos "+"come "+gatoCome+" e faz "+gatoSom);

    }

}
