package it.develhope.hackingweek.entities;

import java.util.Objects;

/**
 * Questa classe rappresenta una poszione della scacchierao
 */

public class Position implements Comparable<Position>{

    /**
     * variabile che indica la prima coordinata
     */
    private int x;

    /**
     * variabile che indica la seconda coordinata
     */
    private int y;

    /**
     * Costruttore con due parametri
     * @param x indica il valore del primo parametro
     * @param y indica il valore del secondo parametro
     */
    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * metodo per accedere alla variabile privata x
     * @return la prima coordinata
     */
    public int getX() {
        return x;
    }

    /**
     * metodo per accedere alla variabile privata y
     * @return la seconda coordinata
     */
    public int getY() {
        return y;
    }

    /**
     * metodo per definire se i due oggetti sono della stessa classe e hanno le stesse coordinate
     * @param o indica l'oggetto in input
     * @return true se e solo se i due oggetti sono della stessa classe e hanno le stesse coordinate
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return x == position.x && y == position.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    /**
     * metodo che ordina prima in base alla x e poi in base alla y le coordinate
     * @param p indica l'oggetto in input
     * @return le coordinate ordinate prima in base alla x e poi in base alla y
     */
    @Override
    public int compareTo(Position p) {
        int result = this.x - p.x;
        if(result == 0) {
            return this.y - p.y;
        }
        return result;
    }

    @Override
    public String toString() {
        return "Position{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
