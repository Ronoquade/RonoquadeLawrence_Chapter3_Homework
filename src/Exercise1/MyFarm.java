package Exercise1;
/**Class: MyFarm
 * @author Ronoquade Lawrence
 * @version 1.0
 * Course: ITEC 2150 Spring 2024
 * Written: March 18, 2024
 *
 * This class tests instances of subclasses from FarmAnimal.
 */
public class MyFarm {
    public static void main(String[] args) {
        FarmAnimal donald = new Duck("Donald", "male", 3.2, 5);
        FarmAnimal cheese = new Duck("Cheese", "female", 3.6, 5);
        FarmAnimal molly = new Cow("Molly", "female", 1600.0, 3);
        FarmAnimal albert = new Chicken("Albert", "male",1.6, 2);
        FarmAnimal amelia = new Chicken("Amelia", "female", 1.8, 4);
        FarmAnimal dixie = new Chicken("Dixie", "female", 1.7, 4);


        FarmAnimal[] farmAnimals = new FarmAnimal[6];
        farmAnimals[0] = donald;
        farmAnimals[1] = cheese;
        farmAnimals[2] = molly;
        farmAnimals[3] = albert;
        farmAnimals[4] = amelia;
        farmAnimals[5] = dixie;

        // putting the objects into the array farmAnimals
        for (int i = 0; i < farmAnimals.length; i++) {
            System.out.println(farmAnimals[i]);
        }

        // Printing out the feeding schedule for each animal in farmAnimals
        for (int i = 0; i < farmAnimals.length; i++) {
            farmAnimals[i].feedLoadingSchedule();
        }
    }
}
