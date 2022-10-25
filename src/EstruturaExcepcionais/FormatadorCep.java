package EstruturaExcepcionais;

public class FormatadorCep {
    public static void main(String[] args) {
        try {
            String meuCepFormado = formatarCep("12312312");
            System.out.println(meuCepFormado);
        } catch (CepInvalidoException e) {
            System.out.println("CEP nao corresponde com as regras de negocios");
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException {
        if (cep.length() != 8)
            throw new CepInvalidoException();

        // simulando um cep formatado
        return "23.765-064";
    }
}
