package excecoes;

import java.text.NumberFormat;
import java.text.ParseException;

public class ExcecoesTest {
    public static void main(String[] args) throws ParseException {
        Number valor;
        //valor = Double.valueOf("a1.75");
        valor = NumberFormat.getInstance().parse("a1.75");
        System.out.println(valor);
    }
}
