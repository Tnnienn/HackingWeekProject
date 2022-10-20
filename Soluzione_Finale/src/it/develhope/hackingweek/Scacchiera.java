package it.develhope.hackingweek;

import it.develhope.hackingweek.Mossa;
import it.develhope.hackingweek.Pezzo;
import it.develhope.hackingweek.Position;
import it.develhope.hackingweek.TavolaDaGioco;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Scacchiera implements TavolaDaGioco {

    private int w;
    private int h;
    private List<Position> listaPosizioni;
    private Map<Position, Pezzo> assegnaPosizioni;

    public Scacchiera(int w, int h) {
        this.w = w;
        this.h = h;
        listaPosizioni = new ArrayList<>();
        assegnaPosizioni = new HashMap<>();
        for (int i = 1; i <= w; i++) {
            for (int j = 1; i <= h; i++) {
                listaPosizioni.add(new Position(i,j));
            }
        }
    }

    @Override
    public int getWidth() {
        return this.w;
    }

    @Override
    public int getHeight() {
        return this.h;
    }

    @Override
    public List<Position> positions() {
        return this.listaPosizioni;
    }

    public void put(Pezzo pz, Position ps) {
        if(isInBoard(ps) && !assegnaPosizioni.containsValue(pz)) {
            assegnaPosizioni.put(ps,pz);
        } else {
            System.out.println("***Errore posizione non valida***");
        }
    }

    public boolean isValid(Mossa m) {
        if(!assegnaPosizioni.get(m.getInitialPosition()).equals(m.getPezzoDaMuovere())) {
            return false;
        }
        return isInBoard(m.getFinalPosition()) && assegnaPosizioni.get(m.getFinalPosition()) == null;
    }

    public void eseguiMossa(Mossa m) {
        if(!isValid(m)) {
            System.out.println("***Mossa non valida***");
            return;
        }
        Pezzo appo = m.getPezzoDaMuovere();
        assegnaPosizioni.remove(m.getInitialPosition());
        assegnaPosizioni.put(m.getFinalPosition(), appo);
        System.out.println("Mossa Eseguita");
    }

}
