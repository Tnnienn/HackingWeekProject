import java.util.Objects;

/**
 * Questa classe rappresenta un pezzo della scacchiera
 * @author Mario Di Cristofano
 */
public class Pezzo {

    /**
     * variabile che indica il tipo di pezzo
     */
    private final TipoPezzo tipo;

    /**
     * variabile che indica il colore del pezzo
     */
    private final ColorePezzo colore;

    /**
     * Costruttore con due parametri
     * @param tipo indica il valore del primo parametro
     * @param colore indica il valore del secondo parametro
     */
    public Pezzo(TipoPezzo tipo, ColorePezzo colore) {
        this.tipo = tipo;
        this.colore = colore;
    }

    /**
     * metodo per accedere alla variabile privata tipo
     * @return il tipo del pezzo
     */
    public TipoPezzo getTipo() {
        return tipo;
    }

    /**
     * metodo per accedere alla variabile privata colore
     * @return il colore del pezzo
     */
    public ColorePezzo getColore() {
        return colore;
    }

    /**
     * metodo per definire se due pezzi sono dello stesso tipo e colore
     * @param o indica l'oggetto in input
     * @return true se i due pezzi sono dello stesso tipo e colore
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pezzo pezzo = (Pezzo) o;
        return Objects.equals(tipo, pezzo.tipo) && Objects.equals(colore, pezzo.colore);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tipo, colore);
    }
}
