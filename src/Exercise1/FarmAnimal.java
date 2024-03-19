package Exercise1;
/**Class: FarmAnimal
 * @author Ronoquade Lawrence
 * @version 1.0
 * Course: ITEC 2150 Spring 2024
 * Written: March 18, 2024
 *
 * This class provides the foundation for inherited classes that represent farm animals.
 */
abstract class FarmAnimal {
   private String name;
   private String gender;
   private double weight;
   private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return " {" +
                "name=" + name +
                ", gender=" + gender +
                ", weight=" + weight +
                ", age=" + age +
                '}';
    }
    public abstract void feedLoadingSchedule();
}