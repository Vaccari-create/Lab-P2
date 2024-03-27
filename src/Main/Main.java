package Main;

import data.Block;
import data.Map;
import java.util.Scanner;

public class Main {

    static void Set_data(){
        Map map = new Map();
        char choice = 'y';
        do{
            System.out.print("Enter row: ");
            Scanner myObj = new Scanner(System.in);
            int row = myObj.nextInt();

            System.out.print("Enter column: ");
            int col = myObj.nextInt();

            System.out.print("Changing: "+row+" - "+col);
            map.change_cell(row,col);
            map.display_on_out();

            System.out.print("Do you want to continue? [y/n]: ");
            choice = myObj.next().charAt(0);

        }while(choice=='y');
    }
    public static void main(String[] args) {
        Set_data();
    }


}