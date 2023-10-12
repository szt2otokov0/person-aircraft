public class Main {
    public static void main(String[] args) {
        Person somebody = new Person();
        somebody.introduce();
        somebody.getGoal();

        Aircraft f16 = AircraftFactory.makeF16();
        f16.fight();
        System.out.println(f16.getStatus());
        Aircraft f35 = AircraftFactory.makeF35();
        f35.fight();
        System.out.println(f35.getStatus());
    }
}