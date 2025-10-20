package repository;

import model.Conta;
import java.util.ArrayList;
import java.util.List;

public class ContaRepository {

    private List<Conta> contas = new ArrayList<>();

    public void adicionar(Conta conta){
        contas.add(conta);
    }

    public List<Conta> listar(){
        return contas;
    }

    public Conta buscarPorIndex(int index){
        if (index >= 0 && index < contas.size()){
            return contas.get(index);
        }
        return null;
    }

    public int tamanho() {
        return contas.size();
    }

}
