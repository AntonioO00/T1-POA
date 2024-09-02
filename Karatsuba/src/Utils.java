public class Utils {

    public static String ajustarTamanho(String binario, int tamanho) {
        StringBuilder binarioBuilder = new StringBuilder(binario);
        while (binarioBuilder.length() < tamanho) {
            binarioBuilder.insert(0, '0');
        }
        return binarioBuilder.toString();
    }
}

