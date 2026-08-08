package minesweeper;

public abstract class Tile implements Displayable {
    //attributes + constructor
    Tile(){

    }

    int tWidth = 50, tHeight = 50; //temporary
    int posX, posY;
    boolean discovered = false;
    boolean flaged = false;

    //methods
    abstract void discover();

    abstract boolean isMine();

    @Override
    public void draw() {
        //find a way to draw an image to the screen
    }
    @Override
    public void flag(){
        //draw a flag
    }
    public void setPosX(int posX) {
        this.posX = posX;
    }
    public void setPoxY(int posY){
        this.posY = posY;
    }
}