package minesweeper;

public class Mine extends Tile{
    Mine(int x, int y){
        posX = x;
        posY = y;
    }
    @Override
    boolean isMine() {
        return true;
    }
    @Override
    void discover(){
        Main.discoveredMine = true;
    }
}
