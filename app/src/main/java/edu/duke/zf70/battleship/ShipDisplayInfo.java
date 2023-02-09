package edu.duke.zf70.battleship;

public interface ShipDisplayInfo<T> {
       public T getInfo(Coordinate where, boolean hit);
}

