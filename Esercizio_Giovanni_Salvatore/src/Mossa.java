import java.util.Objects;

public class Mossa {

    private  Position posizioneIniziale;
    private  Position posizioneFinale;
    private Pezzo pezzoDaMuovere;

    public Mossa(Position posizioneIniziale, Position posizioneFinale, Pezzo pezzoDaMuovere) {
        this.posizioneIniziale = posizioneIniziale;
        this.posizioneFinale = posizioneFinale;
        this.pezzoDaMuovere = pezzoDaMuovere;
    }

    public Position getPosizioneIniziale() {
        return posizioneIniziale;
    }

    public Position getPosizioneFinale() {
        return posizioneFinale;
    }

    public Pezzo getPezzoDaMuovere() {
        return pezzoDaMuovere;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mossa mossa = (Mossa) o;
        return Objects.equals(posizioneIniziale, mossa.posizioneIniziale) && Objects.equals(posizioneFinale, mossa.posizioneFinale) && Objects.equals(pezzoDaMuovere, mossa.pezzoDaMuovere);
    }

    @Override
    public int hashCode() {
        return Objects.hash(posizioneIniziale, posizioneFinale, pezzoDaMuovere);
    }
}
