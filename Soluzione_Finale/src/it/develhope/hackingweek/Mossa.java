package it.develhope.hackingweek;

import java.util.Objects;

public class Mossa {

    private Pezzo pezzoDaMuovere;
    private  Position finalPosition;
    private  Position initialPosition;

    public Mossa(Pezzo pezzoDaMuovere, Position initialPosition, Position finalPosition) {
        this.pezzoDaMuovere = pezzoDaMuovere;
        this.initialPosition = initialPosition;
        this.finalPosition = finalPosition;
    }

    public Pezzo getPezzoDaMuovere() {
        return pezzoDaMuovere;
    }

    public Position getFinalPosition() {
        return finalPosition;
    }

    public Position getInitialPosition() {
        return initialPosition;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mossa mossa = (Mossa) o;
        return Objects.equals(pezzoDaMuovere, mossa.pezzoDaMuovere) && Objects.equals(finalPosition, mossa.finalPosition) && Objects.equals(initialPosition, mossa.initialPosition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pezzoDaMuovere, finalPosition, initialPosition);
    }
}
