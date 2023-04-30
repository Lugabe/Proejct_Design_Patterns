package imposto;

import br.com.alura.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadorDeImpostos {

    public BigDecimal calcular(Orcamento orcamento, Tipoimposto tipoImposto) {
    return tipoImposto.calcular(orcamento);

    }
}