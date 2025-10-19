package model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Conta {
    private String id;
    private TipoConta tipo;
    private BigDecimal valor;
    private String descricao;
    private LocalDate vencimento;
    private boolean pago;
}
