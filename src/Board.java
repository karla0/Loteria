import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Board {

    private int boardNumber;
    private String [][] board = new String [4][4];



    public Board(ArrayList<Tarjeta> tarjetas){

        makeBoard(tarjetas);
        printBoard();

    }

    public Board makeBoard(ArrayList<Tarjeta> tarjetas){

        //shuffles cards in deck
        Collections.shuffle(tarjetas);

        //selects a random index between 1 and 54
        Random random = new Random();

        int index = random.nextInt(53);

        //fills the 3D array with those cards to make a board
        for(int i = 0; i <= 3; i ++){

            for( int j = 0 ; j <= 3; j++){

                board[i][j] = tarjetas.get(index).getName();

                if(index == 53){
                    index = 0;
                    break;
                }
                index++;
            }
        }

        return this;
    }

    public void printBoard(){

        for(int i = 0; i <= 3; i++){

            for (int j = 0; j <= 3; j++){

                System.out.println("i :" + i + " j: " + j + ':'+ board[i][j]);
            }
        }
    }


    public String[][] getBoard() {
        return board;
    }

    public void setBoard(String[][] board) {
        this.board = board;
    }



    public int getBoardNumber() {
        return boardNumber;
    }

    public void setBoardNumber(int boardNumber) {
        this.boardNumber = boardNumber;
    }


}
