package Aula14;

public class Principal {
    public static void main(String[] args) {

        Jogador jogador1 = new Jogador(11, "Renan", true, true);
        Jogador jogador2 = new Jogador(12, "Yana", true, true);

        Equipe equipe = new Equipe("Turma 1");

        equipe.addJogador(jogador1);
        equipe.addJogador(jogador2);

        equipe.mostrarJogadoresTitulares();
    }
}
