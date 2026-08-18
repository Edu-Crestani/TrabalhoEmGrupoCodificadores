public class App {
    public static void main(String[] args) throws Exception {

        String texto = "Este e o string a ser codificado";

        int[] niveisDesejados = {1, 2, 3};

        for (int nivel : niveisDesejados) {
            Codificador cod = CodificadorFactory.criarCodificador(nivel);

            System.out.println("Nivel desejado: " + nivel);
            System.out.println("Codificador: " + cod.getNome());
            System.out.println("Versao: " + cod.getDataCriacao());
            System.out.println("Nivel de segurança: " + cod.getNivelSeguranca());

            String codificado = cod.codifica(texto);
            String decodificado = cod.decodifica(codificado);

            System.out.println("Texto original: " + texto);
            System.out.println("Texto codificado: " + codificado);
            System.out.println("Texto decodificado: " + decodificado);
            System.out.println("-----------------------------");
        }
        
        /*Codificador cod = new CodificadorSimples();

        System.out.println("Codificador: "+cod.getNome());
        System.out.println("Versao: "+cod.getDataCriacao());
        System.out.println("Nivel de segurança: "+cod.getNivelSeguranca());
        
        String texto = "Este e o string a ser codificado";
        String codificado = cod.codifica(texto);
        String decodificado = cod.decodifica(codificado);

        System.out.println("Texto original: "+texto);
        System.out.println("Texto codificado: "+codificado);
        System.out.println("Texto decodificado: "+decodificado);

        CodificadorAleatorio codificadorAleatorio = new CodificadorAleatorio();
        
        System.out.println("Codificador: "+codificadorAleatorio.getNome());
        System.out.println("Versao: "+codificadorAleatorio.getDataCriacao());
        System.out.println("Nivel de segurança: "+codificadorAleatorio.getNivelSeguranca());
        
        String codificado2 = codificadorAleatorio.codifica(texto);
        String decodificado2 = codificadorAleatorio.decodifica(codificado);

        System.out.println("Texto original: "+texto);
        System.out.println("Texto codificado: "+codificado2);
        System.out.println("Texto decodificado: "+decodificado2);
        */

    }
}
