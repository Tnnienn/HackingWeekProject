package it.develhope.hackingweek;

import java.util.Objects;

public class Pezzo {

    private TipoPezzo tipo;
    private ColorePezzo colore;

    public Pezzo(TipoPezzo tipo, ColorePezzo colore) {
        this.tipo = tipo;
        this.colore = colore;
    }

    public TipoPezzo getTipo() {
        return tipo;
    }

    public void setTipo(TipoPezzo tipo) {
        this.tipo = tipo;
    }

    public ColorePezzo getColore() {
        return colore;
    }

    public void setColore(ColorePezzo colore) {
        this.colore = colore;
    }

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
