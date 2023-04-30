import br.com.alura.orcamento.Orcamento;
import desconto.CalculadoraDeDescontos;

import java.math.BigDecimal;

public class TestesDescontos {

    public static void main(String[] args) {

        Orcamento primeiro = new Orcamento(new BigDecimal("200"),6);
        Orcamento segundo = new Orcamento(new BigDecimal("1000"),1);

        CalculadoraDeDescontos calculadoraDeDescontos = new CalculadoraDeDescontos();
        System.out.println(CalculadoraDeDescontos.calcular(primeiro));
        System.out.println(CalculadoraDeDescontos.calcular(segundo));


    }
}
