package data;

public class Map {

    Block[][] matrix;
    private int row = 20;
    private int col = 20;
    public Map(){
        this.matrix = new Block[this.row][this.col];
        for (int i = 0; i < this.row; i++){
            for(int j = 0; j < this.col; j++)
                this.matrix[i][j] = new Block();
        }
    }

    public int getRow() {
        return this.row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return this.col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public void display_on_out(){
        for (int i = 0; i < this.row; i++){
            for(int j = 0; j < this.col; j++) {
                System.out.print(this.matrix[i][j].display());
                System.out.print(" ");
            }
            System.out.print('\n');
        }
    }

    public void change_cell(int i, int j){
        this.matrix[i][j].setContenuto('A');
    }

    public void swap(int i, int j){
        Block temp = this.matrix[i][j];
        this.matrix[i][j] = this.matrix[i+1][j];
        this.matrix[i+1][j] = temp;
    }

    public void insert_at_cords(int i, int j){

    }
    public boolean isOnMap(int i, int j){
        if (i < 0 || i >= this.row || j < 0 || j >= this.col)
            return false;
        else
            return true;
    }
}

