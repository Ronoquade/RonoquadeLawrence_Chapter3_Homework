package Exercise3;
/**Interface: Movement
 * @author Ronoquade Lawrence
 * @version 1.0
 * Course: ITEC 2150 Spring 2024
 * Written: March 18, 2024
 *
 * This interface inherits from the Flight interface and provides the abstract methods walk()
 * and jump().
 */
import Exercise2.Flight;

public interface Movement extends Flight {
    public void walk();
    public void jump();
}
