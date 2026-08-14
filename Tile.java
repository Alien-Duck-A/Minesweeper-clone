

public abstract class Tile{
    //attributes + constructor
    Tile(){

    }

    int posX, posY;
    boolean discovered = false;

    //methods
    abstract void discover();

    abstract boolean isMine();

    public void setPosX(int posX) {
        this.posX = posX;
    }
    public void setPoxY(int posY){
        this.posY = posY;
    }

}