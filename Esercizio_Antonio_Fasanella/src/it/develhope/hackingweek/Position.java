package it.develhope.hackingweek;

import java.util.Objects;

public class Position implements Comparable<Position>{

    private int x;
    private int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
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
    public int compareTo(Position p) {
        int xDiff = this.x - p.x;
        if(xDiff != 0) {
            return xDiff;
        }
        return this.y - p.y;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("X: ").append(this.x).append(" : ");
        sb.append("Y: ").append(this.y).append("\n");
        return sb.toString();
    }
}
