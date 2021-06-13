package javaWeb;

import org.junit.Assert;
import org.junit.Test;

public class CalcularTest {
    @Test
    public void teskAdd() {
        Calcular calcular = new Calcular();
        int a = calcular.add(1, 2);
        //断言
        Assert.assertEquals(3, a);
    }
}
