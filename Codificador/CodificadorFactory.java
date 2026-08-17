public class CodificadorFactory {

    public static Codificador criarCodificador(int nivelDesejado) {

        Codificador[] codificadores = {
                new CodificadorSimples(),
                new CodificadorAleatorio(),
                new CodificadorAtbash()
        };

        Codificador maisProximo = codificadores[0];

        for (Codificador cod : codificadores) {

            int diferencaAtual = Math.abs(
                    nivelDesejado - cod.getNivelSeguranca());

            int diferencaMenor = Math.abs(
                    nivelDesejado - maisProximo.getNivelSeguranca());

            if (diferencaAtual < diferencaMenor) {
                maisProximo = cod;
            }
        }

        return maisProximo;
    }
}