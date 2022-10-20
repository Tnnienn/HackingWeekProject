import java.util.ArrayList;
import java.util.List;

public interface TavolaDaGioco {

    int getWidth();

    int getHeight();

    default boolean isInBoard(Position p){

        if ( (p.x <= getWidth() && p.x > 0 ) && ( p.y <= getHeight() && p.y > 0 ) ) return true;

        else return false;

    }


    ArrayList<Position> positions();
}
