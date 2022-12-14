import java.util.Objects;

public class Position implements Comparable<Position>{

    private int x,y;
    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {return x;}

    public void setX(int x) {this.x = x;}
    public int getY() {return y;}

    public void setY(int y) {this.y = y;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return x == position.x && y == position.y;
    }

    @Override
    public int hashCode() { return Objects.hash(x, y);}

    @Override
    public int compareTo(Position o) {
        int x=this.getX()-o.getX();
        if(x!=0) {
            return x;
        }else{
            return this.getY()-o.getY();
        }
    }

    @Override
    public String toString() {
        return "Position{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
