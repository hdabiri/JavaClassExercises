import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FindAVacancyExercise {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner diskScanner = new Scanner(new File("occupancy"));
        int guestsIn[];
        guestsIn = new int[10];

        for (int roomNum = 0; roomNum < 10; roomNum++) {
            guestsIn[roomNum] = diskScanner.nextInt();
        }

        int roomNum = 0;
        while (roomNum < 10 && guestsIn[roomNum] != 0) {
            roomNum++;
        }
        
        if (roomNum < 10) {
            System.out.print("Room ");
            System.out.print(roomNum);
            System.out.println(" is vacant.");
        } else {
            System.out.println("No vacancy");
        }

        diskScanner.close();
	}

}
