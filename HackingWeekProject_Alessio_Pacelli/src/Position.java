import java.util.Objects;

public class Position implements Comparable<Position>{

    int x, y;

    public Position(int x, int y){

        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return x == position.x && y == position.y;
    }

    @Override
    public int hashCode() {

        return Objects.hash(x, y);
    }

    @Override
    public int compareTo(Position position) {

        if (x > position.x) return position.x;
        if (x < position.x) return x;
        if (x == position.x){

            if (y > position.y) return position.y;
            if (y < position.y) return y;
        }

        return 0;


    }

    @Override
    public String toString() {
        return "Position{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
/**/