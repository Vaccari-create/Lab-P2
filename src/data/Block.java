package data;

public class Block {
        private char contenuto; /*Il modificatore è private perché è un'informazione
                                   che non deve essere modificabile dagli utenti*/

        // Il valore di default viene scelto in due modi. O viene mandato dall'autente come input all'interno del
        // costruttore, altrimenti viene settato dalla classe come '.'

        private boolean falls_with_gravity;
        private boolean fall_through;

        Block(){
            this.contenuto = '.';
            this.falls_with_gravity = false;
            this.fall_through = true;
        }
        Block(char input, boolean falls_with_gravity, boolean fall_through){
            this.contenuto = input;
            this.falls_with_gravity = falls_with_gravity;
            this.fall_through = fall_through;
        }
        public char display(){
            return this.contenuto;
        }

    public char getContenuto() {
        return contenuto;
    }


    public boolean isFalls_with_gravity() {
        return falls_with_gravity;
    }

    public void setFalls_with_gravity(boolean falls_with_gravity) {
        this.falls_with_gravity = falls_with_gravity;
    }

    public boolean isFall_through() {
        return fall_through;
    }

    public void setFall_through(boolean fall_through) {
        this.fall_through = fall_through;
    }

    public void setContenuto(char contenuto) {
        this.contenuto = contenuto;
    }

}
