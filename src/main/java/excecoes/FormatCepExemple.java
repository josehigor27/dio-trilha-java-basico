package excecoes;

public class FormatCepExemple {
    static String formatCep(String cep) throws CepInvalidoException{
        if(cep.length()!=8){
            throw new CepInvalidoException();
        }

        return "12.345-678";
    }

    public static void main(String[] args) throws CepInvalidoException{
        String aux = formatCep("99999999");
        //String aux1 = formatCep("9999999");

        System.out.println(aux);
        //System.out.println(aux1);
    }
}
