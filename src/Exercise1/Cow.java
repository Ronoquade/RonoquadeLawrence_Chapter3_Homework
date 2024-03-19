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
