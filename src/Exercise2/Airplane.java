package Exercise2;
/**Class: Airplane
 * @author Ronoquade Lawrence
 * @version 1.0
 * Course: ITEC 2150 Spring 2024
 * Written: March 18, 2024
 *
 * This class implements the Flight interface and overrides its abstract
 * methods and the toString() method.
 */
public class Airplane implements Flight{
    private String model;
    private String yearBuilt;

    public Airplane(String model, String yearBuilt) {
        this.model = model;
        this.yearBuilt = yearBuilt;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(String yearBuilt) {
        this.yearBuilt = yearBuilt;
    }
    @Override
    public void fly() {
        System.out.println("I'm an airplane that relies on an engine to fly.");
    }
    public String toString() {
        return "Airplane " + "[model=" + getModel() + ", year=" + getYearBuilt() + "]: ";
    }
}
