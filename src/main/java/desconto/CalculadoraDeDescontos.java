package desconto;

import br.com.alura.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {

    public static BigDecimal calcular(Orcamento orcamento) {
        Desconto desconto = new DescontoParaOrcamentoComMaisDeCincoItens(
                new DescontoParaOrcamentoComValorMaiorQueQuinhentos(
                        new SemDesconto()));

        return desconto.calcular(orcamento);
    }
}
