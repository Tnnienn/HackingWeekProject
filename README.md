# HackingWeekProject

1) Creare una classe Position che rappresenta una posizione in una scacchiera. La
classe ha due attributi x e y, un costruttore che li setta, un metodo hashcode e un metodo equals che ritorna true se e solo se i due oggetti sono della stessa classe e hanno
le stesse coordinate. La classe implementa inoltre l’interfaccia Comparable, e il compareTo ordina prima in base alla x e poi in base alla y le coordinate.
2) Creare un enum TipoPezzo che rappresenta i tipi di pezzo possibili: DISCO, RE,
REGINA, TORRE, ALFIERE, CAVALLO, PEDONE. Creare un altro enum ColorePezzo che può assumere i valori BIANCO e NERO.
3) Scrivere una classe Pezzo che rappresenta un pezzo sulla tastiera. La classe avrà un
costruttore che implementa i due attributi tipo e colore, un metodo hashcode e un metodo equals che ritorna true se i due pezzi sono dello stesso tipo e colore.
4) Creare una interfaccia TavolaDaGioco. Tale interfaccia ha i seguenti metodi:
- getWidth() che ritorna la larghezza della scacchiera.
- getHeight() che ritorna l’altezza della scacchiera.
- isInBoard(Position p) metodo di default che prende in input una posizione e ritorna
true se la posizione è una posizione della scacchiera.
- positions() metodo che ritorna la lista di tutte le posizioni della scacchiera ordinate.
4) Creare una classe Mossa che rappresenta una mossa all’interno della scacchiera.
Questa classe avrà un costruttore con il pezzo da muovere, x e y, dove x e y sono le
coordinate della nuova posizione, un metodo hashcode e un metodo equals che ritorna true se le due mosse sono dello stesso pezzo e con stessa posizione finale.
5) Creare una classe it.develhope.hackingweek.entities.Scacchiera che implementa l’interfaccia TavolaDaGioco. Essa
deve implementare i metodi dell’interfaccia TavolaDaGioco e avrà il seguente costruttore:
- prende in input w,h che rappresentano la larghezza e l’altezza della scacchiera. La
scacchiera ha inoltre come attributo una mappa che associa ogni posizione al pezzo
posizionato su di essa. Quando la scacchiera viene creata, avrà tutte posizioni vuote.
6) Implementare inoltre dentro it.develhope.hackingweek.entities.Scacchiera i seguenti metodi:
- put(Pezzo pz, Posizione ps) prende in input un pezzo e una posizione e mette quel
pezzo per la prima volta sulla scacchiera in quella posizione. Il metodo deve controllare se la posizione sia valida e che non sia già occupata da un altro pezzo.
- isValid(Mossa m) che prende in input una mossa e ritorna true se essa è valida in
quel momento, cioè intanto se la posizione di destinazione sia sensata e poi se non sia
già occupata da un altro pezzo.
- eseguiMossa(Mossa m) che prende in input una mossa e la esegue, se valida.
7) Creare una classe it.develhope.hackingweek.Test dove andremo a testare il nostro codice. Creeremo un metodo Main nel quale andremo a costruire delle posizioni, una scacchiera, dei pezzi e
proveremo ad eseguire qualche mossa. Questa classe è parte integrante della prova
e deve essere obbligatoriamente implementata.
