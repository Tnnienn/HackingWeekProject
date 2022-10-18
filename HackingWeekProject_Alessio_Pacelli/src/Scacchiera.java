import java.util.*;


public class Scacchiera implements TavolaDaGioco {

    int w, h;
    Map<Pezzo, Position> posizPezzoMap = new TreeMap<>();

    public Scacchiera(int w, int h){

        this.w = w;
        this.h = h;
    }


    @Override
    public int getWidth() {

        return w;
    }

    @Override
    public int getHeight() {

        return h;
    }

    @Override
    public ArrayList<Position> positions() {

        return positions();
    }

    public void put(Pezzo pz, Position ps){

        if (isInBoard(ps) && !positions().contains(ps)){

            positions().add(ps);

            posizPezzoMap.put(pz, ps);
        }
    }

    public boolean isValid(Mossa m){

        Position nuovaPos = new Position(m.x, m.y);

        if (isInBoard(nuovaPos) && !positions().contains(nuovaPos)) return true;

        else return false;
    }

    public void eseguiMossa(Mossa m){

        if (isValid(m)){

            Position nuovaPos = new Position(m.x, m.y);

            posizPezzoMap.replace(m.pezzo, nuovaPos);
        }
    }
}
