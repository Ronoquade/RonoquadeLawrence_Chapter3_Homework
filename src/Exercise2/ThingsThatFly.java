package Exercise2;
/**Class: ClassName
 * @author Ronoquade Lawrence
 * @version 1.0
 * Course: ITEC 2150 Spring 2024
 * Written: March 18, 2024
 *
 * This class tests objects of classes that implement the Flight interface.
 */
public class ThingsThatFly {
    public static void main(String[] args) {
        Airplane plane = new Airplane("Boeing 747", "2016");
        Bird eagle = new Bird("Eagle");
        Bird hummmingbird = new Bird("Hummingbird");

        Flight[] instances = new Flight[3];
        instances[0] = plane;
        instances[1] = eagle;
        instances[2] = hummmingbird;

        for (int i = 0; i < instances.length; i++) {
            System.out.print(instances[i].toString());
            instances[i].fly();
        }
    }
}
