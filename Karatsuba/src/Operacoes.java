public class Operacoes {

    public String somar(String binario1, String binario2) {
        StringBuilder resultado = new StringBuilder();
        int carry = 0;
        int i = binario1.length() - 1;
        int j = binario2.length() - 1;

        while (i >= 0 || j >= 0 || carry == 1) {
            carry += (i >= 0) ? binario1.charAt(i--) - '0' : 0;
            carry += (j >= 0) ? binario2.charAt(j--) - '0' : 0;
            resultado.insert(0, carry % 2);
            carry /= 2;
        }

        return resultado.toString();
    }

    public String subtrair(String binario1, String binario2) {
        StringBuilder resultado = new StringBuilder();
        int tamanho = Math.max(binario1.length(), binario2.length());
        binario1 = Utils.ajustarTamanho(binario1, tamanho);
        binario2 = Utils.ajustarTamanho(binario2, tamanho);

        for (int i = tamanho - 1; i >= 0; i--) {
            int diferenca = (binario1.charAt(i) - '0') - (binario2.charAt(i) - '0');
            if (diferenca < 0) {
                binario1 = vaiUm(binario1, i);
                diferenca += 2;
            }
            resultado.insert(0, diferenca);
        }
        return resultado.toString();
    }

    public String deslocar(String binario, int passos) {
        StringBuilder deslocado = new StringBuilder(binario);
        for (int i = 0; i < passos; i++) {
            deslocado.append('0');
        }
        return deslocado.toString();
    }


    private String vaiUm(String binario, int posicao) {
        for (int j = posicao - 1; j >= 0; j--) {
            if (binario.charAt(j) == '1') {
                binario = binario.substring(0, j) + '0' + binario.substring(j + 1);
                break;
            }
            binario = binario.substring(0, j) + '1' + binario.substring(j + 1);
        }
        return binario;
    }
}