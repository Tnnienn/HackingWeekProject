package it.develhope.hackingweek;

import java.util.Objects;

public class Mossa {

    private Pezzo pezzoDaMuovere;
    private int x;
    private int y;

    public Mossa(Pezzo pezzoDaMuovere, int x, int y) {
        this.pezzoDaMuovere = pezzoDaMuovere;
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mossa mossa = (Mossa) o;
        return x == mossa.x && y == mossa.y && Objects.equals(pezzoDaMuovere, mossa.pezzoDaMuovere);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pezzoDaMuovere, x, y);
    }
}
