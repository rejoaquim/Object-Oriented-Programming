package MesaAula14;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Porto {

    private String cidade;
    private ArrayList<Container> listaCont = new ArrayList<>();

    public Porto(String cidade) {
        this.cidade = cidade;
    }

    public void entrada(Container Container) {
        listaCont.add(Container);
    }

    public void listar(){
        Collections.sort(listaCont);

        for (Container container: listaCont){
            System.out.println("Número: " + container.getNumero() + " Descrição: " + container.getDescricao() + " País: " + container.getPais() + " Perigoso: " + container.isPerigoso());
        }
    }

    public void qntdPerigosoDesconhecido(){
        Collections.sort(listaCont);

        int contador = 0;

        for (Container container: listaCont) {
            if (container.isPerigoso() && container.getPais().equals("Desconhecido")){
                contador++;
            }
        }

        System.out.println("A quantidade de containers é de " + contador);
    }


}