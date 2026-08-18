import java.time.LocalDate;
import java.util.Random;

public class CodificadorAleatorio implements Codificador{

    private Random random;
    private int numero_random;

    public CodificadorAleatorio(){
        this.random = new Random();
        this.numero_random = random.nextInt(10);
    }
    public String getNome() {
        return "Codificador Aleatorio";
    }

    public LocalDate getDataCriacao() {
        return LocalDate.of(2026, 8, 12);
    }

    public int getNivelSeguranca(){
        return 2;
    }

    public String codifica(String str) {
        StringBuilder encoded = new StringBuilder();

        if(numero_random<5){
            for (char c : str.toCharArray()) {
                encoded.append((char) (c + 1));
            }
            return encoded.toString();
        }
        else{ 
            for (char c : str.toCharArray()) {
                encoded.append((char) (c + 3));
            }
            return encoded.toString();

        }
    }

    public String decodifica(String str) {
        StringBuilder encoded = new StringBuilder();
        
        if(numero_random<5){
            for (char c : str.toCharArray()) {
                encoded.append((char) (c - 1));
            }
            return encoded.toString();
        }
        else{ 
            for (char c : str.toCharArray()) {
                encoded.append((char) (c - 3));
            }
            return encoded.toString();

        }
    }
}