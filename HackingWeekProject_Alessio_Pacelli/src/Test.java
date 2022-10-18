import java.util.ArrayList;
import java.util.Collections;

public class Test {

    public static void main(String[] args) {

        Position position1 = new Position(1,2);
        Position position2 = new Position(3,4);
        Position position3 = new Position(2,3);

        ArrayList<Position> position = new ArrayList<>();

        position.add(position1);
        position.add(position2);
        position.add(position3);

        Collections.sort(position);

        System.out.println(position);

        Scacchiera scacchiera = new Scacchiera(8,8);



        Pezzo pezzo1 = new Pezzo(TipoPezzo.ALFIERE, ColorePezzo.BIANCO);
        Pezzo pezzo2 = new Pezzo(TipoPezzo.ALFIERE, ColorePezzo.BIANCO);

        System.out.println(pezzo1.equals(pezzo2));



        scacchiera.put(pezzo1, position1);

        Mossa mossa1 = new Mossa(pezzo1, 3,5);

        scacchiera.eseguiMossa(mossa1);

    }
}
