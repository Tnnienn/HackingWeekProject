package Classi;
import java.util.Objects;

/**
 * Questa classe rappresenta una mossa da eseguire nella scacchiera
 * @author Mario Di Cristofano
 */
public class Mossa {

    /**
     * variabile che indica il pezzo selezionato
     */
    private Pezzo pezzoScelto;

    /**
     * variabile che indica la posizione finale del pezzo
     */
    private  Position posizioneFinale;

    /**
     * variabile che indica la posizione iniziale del pezzo
     */
    private  Position posizioneDiPartenza;

    /**
     * Costruttore con tre parametri
     * @param pezzoScelto indica il valore del primo parametro
     * @param posizioneDiPartenza indica il valore del secondo parametro
     * @param posizioneFinale indica il valore del terzo parametro
     */
    public Mossa(Pezzo pezzoScelto, Position posizioneDiPartenza, Position posizioneFinale) {
        this.pezzoScelto = pezzoScelto;
        this.posizioneDiPartenza = posizioneDiPartenza;
        this.posizioneFinale = posizioneFinale;
    }

    /**
     * metodo per accedere alla variabile privata pezzoScelto
     * @return il pezzo scelto
     */
    public Pezzo getPezzoScelto() {
        return pezzoScelto;
    }

    /**
     * metodo per accedere alla variabile privata posizioneFinale
     * @return la posizione finale del pezzo
     */
    public Position getPosizioneFinale() {
        return posizioneFinale;
    }

    /**
     * metodo per accedere alla variabile privata posizioneDiPartenza
     * @return la posizione di partenza del pezzo
     */
    public Position getPosizioneDiPartenza() {
        return posizioneDiPartenza;
    }

    /**
     * metodo per definire se le due mosse sono dello stesso pezzo e con stessa posizione finale
     * @param o indica l'oggetto in input
     * @return true se le due mosse sono dello stesso pezzo e con stessa posizione finale
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mossa mossa = (Mossa) o;
        return Objects.equals(pezzoScelto, mossa.pezzoScelto) && Objects.equals(posizioneFinale, mossa.posizioneFinale) && Objects.equals(posizioneDiPartenza, mossa.posizioneDiPartenza);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pezzoScelto, posizioneFinale, posizioneDiPartenza);
    }
}
