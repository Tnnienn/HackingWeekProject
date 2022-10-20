import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Scacchiera implements TavolaDaGioco{

    protected int w;
    protected int h;
    protected Map<Position, Pezzo> assegnazionePosizioni = new HashMap<>();

    protected List<Position> listaposizioni = new ArrayList<>();


    public Scacchiera(int w, int h){
        this.w = w;
        this.h = h;
        for(int i = 1; i <= w; i++){
            for(int j = 1; j <= h; j++){
                listaposizioni.add(new Position(i,j));
                //assegnazionePosizioni.put(new Position(i,j),new Pezzo(null,null));
            }
        }
    }

    @Override
    public int getWith() {
        return w;
    }

    @Override
    public int getHeight() {
        return h;
    }

    //@Override
   // public boolean isInBoard(Position p) {
      //  return TavolaDaGioco.super.isInBoard(p);
   // }

    @Override
    public List <Position> positions() {
        return listaposizioni;
    }

    public void put(Pezzo pz, Position ps){
        //assegnazionePosizioni.get(ps).tipo == null  && assegnazionePosizioni.get(ps).colore == null
        if(isInBoard(ps) && !assegnazionePosizioni.containsValue(pz) ){
            assegnazionePosizioni.put(ps,pz);
        }else{
            System.out.println("POSIZIONE ERRATA O OCCUPATA");
        }
    }

    public boolean isValid(Mossa m){
        if(isInBoard(m.b) &&  assegnazionePosizioni.get(m.b) == null){
            return true;
        }else{
            return false;
        }
    }

    public void eseguiMossa(Mossa m){
        if(isValid(m)){
            assegnazionePosizioni.put(m.b,m.a);
            System.out.println("MOSSA ESEGUITA");
        }else{
            System.out.println("MOSSA NON ESEGUITA");
        }
    }
}
