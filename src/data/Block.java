package data;

public class Block {
        private char contenuto; /*Il modificatore è private perché è un'informazione
                                   che non deve essere modificabile dagli utenti*/

        // Il valore di default viene scelto in due modi. O viene mandato dall'autente come input all'interno del
        // costruttore, altrimenti viene settato dalla classe come '.'

        Block(){
            this.contenuto = '.';
        }
        Block(char input){
            this.contenuto = input;
        }
        public char display(){
            return this.contenuto;
        }

    public char getContenuto() {
        return contenuto;
    }

    public void setContenuto(char contenuto) {
        this.contenuto = contenuto;
    }
}
