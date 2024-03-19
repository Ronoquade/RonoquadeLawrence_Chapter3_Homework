package Exercise1;
/**Class: Cow
 * @author Ronoquade Lawrence
 * @version 1.0
 * Course: ITEC 2150 Spring 2024
 * Written: March 18, 2024
 *
 * This class inherits from the FarmAnimal class and overrides the feedLoadingSchedule abstract method.
 */
public class Cow extends FarmAnimal{
    private String sound = "Moo Moo";
    public Cow(String name, String gender, double weight, int age) {
        setName(name);
        setGender(gender);
        setWeight(weight);
        setAge(age);
    }
    @Override
    public void feedLoadingSchedule() {
        System.out.println(getName() + ": 6am-4pm");
    }
    @Override
    public String toString() {
        return "Cow " + sound + super.toString();
    }
}
