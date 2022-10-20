public class Test {
    public static void main(String[] args) {

        //Creazione Scacchiera
        Scacchiera scacchiera = new Scacchiera(8,8);
        System.out.println(scacchiera.getHeight());
        System.out.println(scacchiera.getHeight());

        //Creazione Pezzi
        Pezzo torre = new Pezzo(TipoPezzo.TORRE,ColorePezzo.NERO);
        Pezzo cavallo = new Pezzo(TipoPezzo.CAVALLO,ColorePezzo.NERO);
        Pezzo re = new Pezzo(TipoPezzo.RE,ColorePezzo.NERO);
        Pezzo regina = new Pezzo(TipoPezzo.REGINA,ColorePezzo.NERO);
        Pezzo pedoneUno = new Pezzo(TipoPezzo.PEDONE,ColorePezzo.NERO);
        Pezzo PedoneDue = new Pezzo(TipoPezzo.PEDONE,ColorePezzo.NERO);

        scacchiera.put(torre,new Position(1,1));
        scacchiera.put(cavallo,new Position(2,1));
        scacchiera.put(re,new Position(3,1));
        scacchiera.put(regina,new Position(4,1));
        scacchiera.put(pedoneUno,new Position(5,1));
        scacchiera.put(PedoneDue,new Position(3,1));

        System.out.println(scacchiera.isInBoard(new Position(1,4)));
        System.out.println(scacchiera.isInBoard(new Position(1,1)));
        System.out.println(scacchiera.isInBoard(new Position(8,9)));
        System.out.println(scacchiera.listaposizioni);

        //Creazione Mosse
        Mossa uno = new Mossa(torre,new Position(1,3));
        Mossa due = new Mossa(torre,new Position(4,1));
        System.out.println(scacchiera.isValid(uno));
        System.out.println(scacchiera.isValid(due));
        scacchiera.eseguiMossa(uno);
        scacchiera.eseguiMossa(due);


    }

}
