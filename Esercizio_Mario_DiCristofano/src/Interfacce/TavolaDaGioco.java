package Interfacce;
import Classi.Position;
import java.util.List;

/**
 * Questa interfaccia rappresenta la Tavola da gioco
 * @author Mario Di Cristofano
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
