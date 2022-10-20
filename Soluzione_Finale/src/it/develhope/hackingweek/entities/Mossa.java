package it.develhope.hackingweek.entities;

import java.util.Objects;

/**
 * Questa classe rappresenta una mossa da eseguire nella scacchiera
 */
public class Mossa {

    /**
     * variabile che indica il pezzo selezionato
     */
    private Pezzo pezzoScelto;

    /**
     * variabile che indica la posizione finale del pezzo
     */
    private Position finalPosition;

    /**
     * variabile che indica la posizione iniziale del pezzo
     */
    private Position initialPosition;

    /**
     * Costruttore con tre parametri
     * @param pezzoScelto indica il valore del primo parametro
     * @param initialPosition indica il valore del secondo parametro
     * @param finalPosition indica il valore del terzo parametro
     */
    public Mossa(Pezzo pezzoScelto, Position initialPosition, Position finalPosition) {
        this.pezzoScelto = pezzoScelto;
        this.initialPosition = initialPosition;
        this.finalPosition = finalPosition;
    }

    /**
     * metodo per accedere alla variabile privata pezzoScelto
     * @return il pezzo scelto
     */
    public Pezzo getPezzoDaMuovere() {
        return pezzoScelto;
    }

    /**
     * metodo per accedere alla variabile privata posizioneFinale
     * @return la posizione finale del pezzo
     */
    public Position getFinalPosition() {
        return finalPosition;
    }

    /**
     * metodo per accedere alla variabile privata posizioneDiPartenza
     * @return la posizione di partenza del pezzo
     */
    public Position getInitialPosition() {
        return initialPosition;
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
        return Objects.equals(pezzoScelto, mossa.pezzoScelto) && Objects.equals(finalPosition, mossa.finalPosition) && Objects.equals(initialPosition, mossa.initialPosition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pezzoScelto, finalPosition, initialPosition);
    }
}
