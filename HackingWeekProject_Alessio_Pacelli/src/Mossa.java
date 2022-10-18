import java.util.Objects;

public class Mossa {

    Pezzo pezzo;
    int x,y;

    public Mossa (Pezzo pezzo, int x, int y){

        this.pezzo = pezzo;
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mossa mossa = (Mossa) o;
        return x == mossa.x && y == mossa.y && pezzo.equals(mossa.pezzo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pezzo, x, y);
    }
}
