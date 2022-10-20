import java.util.ArrayList;

public interface TavolaDaGioco {

    int getWith();
    int getHeight();
    default boolean isInBoard(Position p){
        if(p.x <= getWith() && p.y <= getHeight()){
            return true;
        }
        return false;
    };
    ArrayList <Position> positions();
}
