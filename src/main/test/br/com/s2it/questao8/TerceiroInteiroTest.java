package br.com.s2it.questao8;

import org.junit.Assert;
import org.junit.Test;

public class TerceiroInteiroTest {

	@Test
    public void testResultadoUmNegativo() {

        // Init
        Integer c = -1;
        String a = "10256";
        String b = "512";

        // Act
        TerceiroInteiro number = new TerceiroInteiro();


        Assert.assertEquals(c, number.gerarTerceiroInteiro(a, b));

    }


    @Test
    public void testMergeNumeros() {

        Integer c = 150122;
        String a = "102";
        String b = "512";

        TerceiroInteiro number = new TerceiroInteiro();
        Assert.assertEquals(c, number.gerarTerceiroInteiro(a, b));

    }
}
