package Exercise2;
/**Class: Bird
 * @author Ronoquade Lawrence
 * @version 1.0
 * Course: ITEC 2150 Spring 2024
 * Written: March 18, 2024
 *
 * This class implements the Flight interface and overrides the fly() and toString() methods.
 */
public class Bird implements Flight{
    private String type;

    public Bird(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void fly() {
        System.out.println("I'm a bird who flaps my wings to fly.");
    }
    public String toString() {
        return "Bird " + "[type=" + getType() + "]: ";
    }
}
