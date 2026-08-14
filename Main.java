import java.util.Random;

public class Main {
    public static boolean discoveredMine = false;
    public static final int width = 30, height = 16;
    public static Tile[][] grid = new Tile[width][height];
    static public enum State {GAMEOVER, QUIT, CONTINUE, VICTORY}
    static public State currentState = State.CONTINUE;
    public static void main(String[] args){
        //Gameloop must determine if a mine has been discovered
        //then end the game if it has.
        createBoard();
        MineSweeperWindow mainWindow = new MineSweeperWindow();
        
        while (currentState != State.QUIT){
            showGrid();
        }
    }
    

    static void leftClick(int x, int y){
        grid[y][x].discover();
    }
    
    static void rightClick(int x, int y){
        //grid[y][x].flag();
    }

    static void showGrid(){
        for (int row = 0; row < height; row++){
            for (Tile t : grid[row]){
                //t.draw();
            }
        }
    }


    static void createBoard(){
        int value = 1;
        Random random = new Random();
        for(int x = 0; x < width; x++){ //I think thats not x, but y (inverted logic rn)
            for(int y = 0; y < height ; y++){
                //random value to have 20% chance of mine
                int determineTile = random.nextInt(1, 6);
                if (determineTile == value){
                    grid[x][y] = new Mine(x, y);
                }
                else {
                    grid[x][y] = new safeTile(x, y);
                }
            }
        }
    }
}
