package data;

public class Map {

    Block[][] matrix;
    private int row = 50;
    private int col = 50;
    public Map(){
        this.matrix = new Block[this.row][this.col];
        for (int i = 0; i < this.row; i++){
            for(int j = 0; j < this.col; j++)
                this.matrix[i][j] = new Block();
        }
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


    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

}
