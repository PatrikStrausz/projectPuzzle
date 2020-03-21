package sample;


public class Field {
    private Tile[][] tiles;

    public Field() {

    }

    public Tile[][] getTiles() {
        return tiles;
    }

    public void setTiles(Tile[][] tiles) {
        this.tiles = tiles;
    }

    private void initField() {
        tiles = new Tile[4][4];
        for (int i = 0; i < tiles.length; i++) {
            for (int j = 0; j < tiles.length; j++) {
                tiles[i][j] = new Tile();
            }
        }
    }

    public boolean isWon() {
        return tiles[0][0].getValue() == 1
                && tiles[0][1].getValue() == 2
                && tiles[0][2].getValue() == 3
                && tiles[0][3].getValue() == 4
                && tiles[1][0].getValue() == 5
                && tiles[1][1].getValue() == 6
                && tiles[1][2].getValue() == 7
                && tiles[1][3].getValue() == 8
                && tiles[2][0].getValue() == 9
                && tiles[2][1].getValue() == 10
                && tiles[2][2].getValue() == 11
                && tiles[2][3].getValue() == 12
                && tiles[3][0].getValue() == 13
                && tiles[3][1].getValue() == 14
                && tiles[3][2].getValue() == 15
                && tiles[3][3].getValue() == 0
                ;
    }

}



