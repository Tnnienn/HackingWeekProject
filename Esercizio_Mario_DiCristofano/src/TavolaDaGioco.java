import java.util.List;

public interface TavolaDaGioco {

    int getWith();
    int getHeight();
    default boolean isInBoard(Position p){
        return p.x <= getWith() && p.y <= getHeight();
    };
    List<Position> positions();
}
