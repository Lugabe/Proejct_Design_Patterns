package imposto;

import br.com.alura.orcamento.Orcamento;

import java.math.BigDecimal;

public interface Tipoimposto {

    public BigDecimal calcular(Orcamento orcamento);

}
