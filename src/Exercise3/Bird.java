package Exercise3;
/**Class: Bird
 * @author Ronoquade Lawrence
 * @version 1.0
 * Course: ITEC 2150 Spring 2024
 * Written: March 18, 2024
 *
 * This class implements the Movement interface and overrides the toString() and abstract
 * methods walk() and jump().
 */

public class Bird implements Movement {
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
        System.out.println("I flap my wings to fly.");
    }
    public String toString() {
        return "Bird " + "[type=" + getType() + "]: ";
    }
    @Override
    public void walk() {
        System.out.println("I walk on my feet.");
    }
    @Override
    public void jump() {
        System.out.println("I jump by leaping from my feet.");
    }
}
