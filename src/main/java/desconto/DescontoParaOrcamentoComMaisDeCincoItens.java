package desconto;

import br.com.alura.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoParaOrcamentoComMaisDeCincoItens  extends Desconto {
    protected DescontoParaOrcamentoComMaisDeCincoItens(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal calcular(Orcamento orcamento) {
        if (orcamento.getQuantidadedeItens() > 5) {
            return orcamento.getValor().multiply(new BigDecimal("0.1"));
        }
        else {
            return proximo.calcular(orcamento);
        }
    }
}
