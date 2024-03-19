package Exercise1;
/**Class: Duck
 * @author Ronoquade Lawrence
 * @version 1.0
 * Course: ITEC 2150 Spring 2024
 * Written: March 18, 2024
 *
 * This class inherits from the FarmAnimal class and overrides the feedLoadingSchedule abstract method.
 */
public class Duck extends FarmAnimal{
    private String sound = "Quack Quack";
    public Duck(String name, String gender, double weight, int age) {
        setName(name);
        setGender(gender);
        setWeight(weight);
        setAge(age);
    }
    @Override
    public void feedLoadingSchedule() {
        System.out.println(getName() + ": 8am-12pm-6pm");
    }
    @Override
    public String toString() {
        return "Duck " + sound + super.toString();
    }
}
