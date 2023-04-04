import lab7.compulsory.Exploration;
import lab7.compulsory.Robot;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Exploration exploration = new Exploration();
        exploration.start(3, 2); // start exploration with a 3x3 map and 2 robots
        try {
            Thread.sleep(5000); // wait for 5 seconds to let the exploration run
        } catch (InterruptedException e) {
        }
        exploration.stopRunning(); // stop the exploration
        System.out.println("Exploration stopped.");
    }
}