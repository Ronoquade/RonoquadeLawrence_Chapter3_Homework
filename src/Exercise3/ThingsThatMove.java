package Exercise3;
/**Class: ThingsThatMove
 * @author Ronoquade Lawrence
 * @version 1.0
 * Course: ITEC 2150 Spring 2024
 * Written: March 18, 2024
 *
 * This class tests instances of classes that implement the Movement interface.
 */
public class ThingsThatMove {
    public static void main(String[] args) {
        Airplane plane = new Airplane("Boeing 747", "2016");
        Bird eagle = new Bird("Eagle");
        Bird hummmingbird = new Bird("Hummingbird");

        Movement[] instances = new Movement[3];
        instances[0] = plane;
        instances[1] = eagle;
        instances[2] = hummmingbird;

        for (int i = 0; i < instances.length; i++) {
            System.out.println(instances[i].toString());
            instances[i].fly();
            instances[i].walk();
            instances[i].jump();
        }
    }
}
