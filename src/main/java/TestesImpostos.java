import br.com.alura.orcamento.Orcamento;
import imposto.CalculadorDeImpostos;
import imposto.Icms;

import java.math.BigDecimal;

public class TestesImpostos {

    public static void main(String[] args) {

        Orcamento orcamento = new Orcamento(new BigDecimal("100"));
        CalculadorDeImpostos calculadorDeImpostos = new CalculadorDeImpostos();
        System.out.println(calculadorDeImpostos.calcular(orcamento, new Icms()));

    }
}
