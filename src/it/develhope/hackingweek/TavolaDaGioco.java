package it.develhope.hackingweek;

import java.util.ArrayList;
import java.util.List;

public interface TavolaDaGioco {

    int getWidth();
    int getHeight();
    default boolean isInBoard(Position p) {
        return (p.getX() >= 0 && p.getX() <= getWidth()) && (p.getY() >= 0 && p.getY() <= getHeight());
    }
    List<Position> positions();
}
