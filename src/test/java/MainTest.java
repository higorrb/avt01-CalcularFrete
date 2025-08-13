import org.example.Main;
import org.junit.Test;


import static org.junit.Assert.assertEquals;


public class MainTest {
    @Test
    public void testMain(){
        //entrada
        double subtotal = 50;
        double distancia = 2;


        //saida esperada
        double esperado = 6.99;


        //execucao
        double resultado = Main.CalcularFrete(subtotal, distancia);


        //validacao
        assertEquals("O frete calculado esta incorreto", esperado, resultado, 0.0001);
    }
}
