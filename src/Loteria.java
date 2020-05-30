import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Loteria {

    ArrayList<Tarjeta> tarjetas = new ArrayList<>();
    ArrayList<Board> boards = new ArrayList<>();


     Loteria() throws FileNotFoundException {

         getAndShuffleDeck();

         Board board = new Board(tarjetas);
    }

    public void getAndShuffleDeck() throws FileNotFoundException {

        File file = new File("Resources/Cards");
        Scanner scanner = new Scanner(file);

        while(scanner.hasNext()){
            Tarjeta tarjeta = new Tarjeta(scanner.nextLine());

            tarjetas.add(tarjeta);
        }

        scanner.close();

        Collections.shuffle(tarjetas);
    }

    public void pickBoards(){


    }



}
