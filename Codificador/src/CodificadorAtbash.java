import java.time.LocalDate;

public class CodificadorAtbash implements Codificador {

    public String getNome() {
        return "Codificador Atbash";
    }

    public LocalDate getDataCriacao() {
        return LocalDate.of(2026, 8, 17);
    }

    public int getNivelSeguranca() {
        return 3;
    }

    public String codifica(String str) {
        StringBuilder encoded = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                encoded.append((char) ('z' - (c - 'a')));
            } else if (c >= 'A' && c <= 'Z') {
                encoded.append((char) ('Z' - (c - 'A')));
            } else {
                encoded.append(c);
            }
        }
        return encoded.toString();
    }

    public String decodifica(String str) {
        // Atbash é simétrico: decodificar é igual a codificar
        return codifica(str);
    }
}