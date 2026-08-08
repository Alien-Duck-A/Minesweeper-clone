import java.util.Random;
package minesweeper;

public class Main {
    public static boolean discoveredMine = false;
    public static Tile[][] grid = new Tile[30][16];
    public static void main(String[] args){
        //Gameloop must determine if a mine has been discovered
        //then end the game if it has.
    }


    static void createBoard(){
        int value = 1;
        Random random = new Random();
        for(int x = 0; x < grid.length; x++){
            for(int y = 0; y < grid[x].length ; y++){
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
