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
