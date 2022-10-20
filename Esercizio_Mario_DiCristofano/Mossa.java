import java.util.Objects;

public class Mossa {

    protected Pezzo a;
    protected Position b;

    public Mossa(Pezzo a,Position b){
        this.a = a;
        this.b = b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mossa mossa = (Mossa) o;
        return Objects.equals(a, mossa.a) && Objects.equals(b, mossa.b);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }
}
