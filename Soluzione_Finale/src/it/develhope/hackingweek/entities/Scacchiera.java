package it.develhope.hackingweek.entities;
import it.develhope.hackingweek.interfaces.TavolaDaGioco;

import java.util.*;

/**
 * Questa classe rappresenta una scacchiera
 */
public class Scacchiera implements TavolaDaGioco {

    /**
     * Questa variabile indica la larghezza della scacchiera
     */
    private int w;

    /**
     * Questa variabile indica l'altezza della scacchiera
     */
    private int h;

    /**
     * Questa lista raccoglie tutte le posizioni della scacchiera
     */
    private List<Position> listaPosizioni;

    /**
     * Questa mappa  associa ogni posizione al pezzo posizionato su di essa
     */
    private Map<Position, Pezzo> assegnaPosizioni;

    /**
     * Costruttore con due parametri
     * @param w indica il valore del primo parametro
     * @param h indica il valore del secondo parametro
     */
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

    /**
     * Metodo che ritorna la larghezza della scacchiera.
     * @return a la larghezza della scacchiera.
     */
    @Override
    public int getWidth() {
        return this.w;
    }

    /**
     * Metodo che ritorna l'altezza della scacchiera.
     * @return l’altezza della scacchiera.
     */
    @Override
    public int getHeight() {
        return this.h;
    }

    /**
     * Metodo che ritorna la lista di tutte le posizioni della scacchiera ordinate
     * @return la lista di tutte le posizioni della scacchiera ordinate.
     */
    @Override
    public List<Position> positions() {
        return this.listaPosizioni;
    }

    /**
     * Metodo che deve controllare se la posizione è valida e che non sia già occupata da un altro pezzo.
     * Inserisce il pezzo per la prima volta sulla scacchiera
     * @param pz indica il primo oggetto preso in input
     * @param ps indica il secondo oggetto preso in input
     */
    public void put(Pezzo pz, Position ps) {
        if(isInBoard(ps) && !assegnaPosizioni.containsKey(ps)) {
            assegnaPosizioni.put(ps,pz);
        } else {
            System.out.println("***Errore posizione non valida***");
        }
    }

    /**
     * Metodo che controlla se la destinazione è sensata e che non sia già occupata da un altro pezzo.
     * @param m indica l'oggetto in input
     * @return true se la mossa è valida
     */

    public boolean isValid(Mossa m) {
        if(!assegnaPosizioni.get(m.getInitialPosition()).equals(m.getPezzoDaMuovere())) {
            return false;
        }
        return isInBoard(m.getFinalPosition()) && assegnaPosizioni.get(m.getFinalPosition()) == null;
    }

    /**
     * Metodo che esegue una mossa se ritenuta valida
     * @param m indica l'oggetto in input
     */

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
