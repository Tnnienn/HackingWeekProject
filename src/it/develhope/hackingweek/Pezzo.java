package it.develhope.hackingweek;

import java.util.Objects;

public class Pezzo {

    private String tipo;
    private String colore;

    public Pezzo(String tipo, String colore) {
        this.tipo = tipo;
        this.colore = colore;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
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
