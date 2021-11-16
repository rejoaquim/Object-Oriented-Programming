package MesaAula11;

public class Cachorro extends Animal {
    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public String emitirSom() {
    return "AU AU AU AU AU AU";
    }

    public String correr(){
        return "Corre muuuuito";

    }
}
