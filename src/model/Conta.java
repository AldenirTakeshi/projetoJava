package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Conta {

    private TipoConta tipo;
    private double valor;
    private String descricao;
    private LocalDate vencimento;
    private boolean pago;

    public Conta(TipoConta tipo, double valor, String descricao, LocalDate vencimento){
        this.tipo = tipo;
        this.valor = valor;
        this.descricao = descricao;
        this.vencimento = vencimento;
        this.pago = false;
    }

    public TipoConta getTipo() { return tipo; }
    public double getValor() { return valor; }
    public String getDescricao() { return descricao; }
    public LocalDate getVencimento() { return vencimento; }
    public boolean isPago() { return pago; }
    public void setPago(boolean pago) { this.pago = pago; }

    @Override
    public String toString() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return String.format("[%s] R$ %.2f - %s (Venc: %s) - %s",
                tipo, valor, descricao, vencimento.format(fmt), pago ? "PAGO" : "PENDENTE");
    }

}
