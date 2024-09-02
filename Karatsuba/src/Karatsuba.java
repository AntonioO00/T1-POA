
class Karatsuba {
    private Operacoes operacoes = new Operacoes();

    public String multiplicar(String bin1, String bin2) {
        int tamanho = Math.max(bin1.length(), bin2.length());
        bin1 = Utils.ajustarTamanho(bin1, tamanho);
        bin2 = Utils.ajustarTamanho(bin2, tamanho);


        if (tamanho == 1) return String.valueOf((bin1.charAt(0) - '0') * (bin2.charAt(0) - '0'));

        int meio = tamanho / 2;
        String bin1ESQ = bin1.substring(0, meio);
        String bin1DIR = bin1.substring(meio);
        String bin2ESQ = bin2.substring(0, meio);
        String bin2DIR = bin2.substring(meio);

        String P1 = multiplicar(bin1ESQ, bin2ESQ);
        String P2 = multiplicar(bin1DIR, bin2DIR);
        String P3 = multiplicar(operacoes.somar(bin1ESQ, bin1DIR), operacoes.somar(bin2ESQ, bin2DIR));

        String deslocadoP1 = operacoes.deslocar(P1, 2 * (tamanho - meio));
        String produtoParcial3MenosSomaDeslocada = operacoes.deslocar(operacoes.subtrair(P3, operacoes.somar(P1, P2)), tamanho - meio);

        return operacoes.somar(operacoes.somar(deslocadoP1, P2), produtoParcial3MenosSomaDeslocada);
    }
}


