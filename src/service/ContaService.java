package service;

import model.Conta;
import repository.ContaRepository;
import java.time.LocalDate;

public class ContaService {
    private ContaRepository repo;

    public ContaService(ContaRepository repo){
        this.repo = repo;
    }

    public void lancarConta(String tipo, double valor, String descricao, LocalDate vencimento){
        Conta c = new Conta(tipo, valor,descricao,vencimento);
        repo.adicionar(c);
    }

    public void listarContas(){
        if(repo.tamanho() == 0){
            System.out.println("Nenhuma conta cadastrada.");
            return;
        }
        for (int i = 0; i < repo.tamanho(); i++) {
            System.out.println((i + 1) + ". " + repo.listar().get(i));
        }
    }

    public void marcarComoPaga(int indice) {
        Conta conta = repo.buscarPorIndex(indice);
        if (conta == null) {
            System.out.println("Índice inválido.");
            return;
        }
        conta.setPago(true);
        System.out.println("Conta marcada como paga!");
    }

    public void mostrarTotais() {
        double totalPagar = 0;
        double totalReceber = 0;

        for (Conta c : repo.listar()) {
            if (c.getTipo().equals("PAGAR")) totalPagar += c.getValor();
            else if (c.getTipo().equals("RECEBER")) totalReceber += c.getValor();
        }

        double totalGeral = totalReceber - totalPagar;

        System.out.println("\n--- Totais ---");
        System.out.printf("Total a pagar: R$ %.2f%n", totalPagar);
        System.out.printf("Total a receber: R$ %.2f%n", totalReceber);
        System.out.printf("Saldo geral: R$ %.2f%n", totalGeral);
    }

}
