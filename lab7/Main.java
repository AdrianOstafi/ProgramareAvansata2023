import lab7.compulsory.Exploration;
import lab7.compulsory.Robot;

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