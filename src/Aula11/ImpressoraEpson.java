package Aula11;

import java.time.LocalDate;

public class ImpressoraEpson extends Impressora {

    public ImpressoraEpson(String modelo, String tipoConexao, LocalDate dataFabricacao, int folhasDisponiveis, double porcTinta) {
        super(modelo, tipoConexao, dataFabricacao, folhasDisponiveis, porcTinta);
    }

    @Override
    public String imprimir() {
        if (temPapel() && !precisaTinta()){
            return "Imprimindo!!";
        }else if (temPapel() && precisaTinta()){
            return "Você precisa adicionar tinta!";
        }else if (!temPapel() && precisaTinta()){
            return "Você precisa de tinta e não tem papel"
        }else if (!temPapel() && !precisaTinta()){
            return "Você não tem papel!";
        }
    }

}
