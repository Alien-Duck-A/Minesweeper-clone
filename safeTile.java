

public class safeTile extends Tile {
    int minesNearby;
    
    safeTile(int x, int y){
        posX = x; 
        posY = y;
    }
    @Override
    boolean isMine() {
        return false;
    }
    @Override
    public void discover(){
        Tile[][] localGrid = Main.grid;
        int sumx = posX - 1;
        int sumy = posY - 1;
        for(int i = 0; i < 3; i++){
            if (sumx < 0){
                sumx += 1;
                continue;
            }
            else if (sumx + 1 >= 30){
                continue;
            }
            for(int j = 0; j < 3; j++){
                if (sumy < 0){
                    sumy += 1;
                    continue;
                }
                else if (sumy + 1 >= 16){
                    continue;
                }
                else{
                    if (localGrid[sumx][sumy].isMine()){
                        minesNearby += 1;
                    }
                }
            }
            sumy = posY - 1;
        }
        //draw self
    }
}
