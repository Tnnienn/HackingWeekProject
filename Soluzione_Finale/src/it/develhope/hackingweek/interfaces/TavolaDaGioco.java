package it.develhope.hackingweek.interfaces;

import it.develhope.hackingweek.entities.*;

import java.util.List;

/**
 * Questa interfaccia rappresenta la Tavola da gioco
 */
public interface TavolaDaGioco {

    int getWidth();

    int getHeight();

    /**
     * metodo che verifa se la posizione è una posizione della scacchiera
     * @param p indica l'oggetto in input
     * @return true se la posizione è una posizione della scacchiera
     */
    default boolean isInBoard(Position p) {
        return (p.getX() >= 0 && p.getX() <= getWidth()) && (p.getY() >= 0 && p.getY() <= getHeight());
    }
    List <Position> positions();
}
