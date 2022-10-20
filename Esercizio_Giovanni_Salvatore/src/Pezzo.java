import java.util.Objects;

public class Pezzo {
    private final TipoPezzo tipo;
    private final ColorePezzo colore;

    public Pezzo(TipoPezzo tipo, ColorePezzo colore) {
        this.tipo = tipo;
        this.colore = colore;
    }

    public TipoPezzo getTipo() {
        return tipo;
    }

    public ColorePezzo getColore() {
        return colore;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pezzo pezzo = (Pezzo) o;
        return tipo == pezzo.tipo && colore == pezzo.colore;
    }

    @Override
    public int hashCode() {
        return Objects.hash(tipo, colore);
    }
}
