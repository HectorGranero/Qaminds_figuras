package abstraccion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FiguraTest {

    @Test
    public void validarCalcularAreaCirculo(){
        double radio = 5;
        Circulo circulo = new Circulo(radio);

        double resultadoEsperado = Math.PI * radio * radio;

        Assert.assertEquals(circulo.calcularArea(),resultadoEsperado);
    }

    @Test
    public void validarCalcularAreaTriangulo(){
        double base = 25;
        double altura = 50;

        Triangulo triangulo = new Triangulo(base,altura);

        double resultadoEsperado = (base * altura) / 2;

        Assert.assertEquals(triangulo.calcularArea(),resultadoEsperado);
    }

    @Test
    public void validarCalcularAreaRectangulo(){
        double base = 36;
        double altura = 10;

        Rectangulo rectangulo = new Rectangulo(base,altura);

        double resultadoEsperado = base * altura;

        Assert.assertEquals(rectangulo.calcularArea(),resultadoEsperado);
    }
}
