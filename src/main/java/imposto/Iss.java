package imposto;

import br.com.alura.orcamento.Orcamento;

import java.math.BigDecimal;

public class Iss implements  Tipoimposto{
    public BigDecimal calcular(Orcamento orcamento){
        return  orcamento.getValor().multiply(new BigDecimal("0.06"));
    }

}
