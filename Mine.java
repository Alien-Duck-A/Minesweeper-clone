

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
    public void discover(){
        Main.discoveredMine = true;
    }
}
