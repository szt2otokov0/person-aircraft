public class Person {
    private String name;
    private int age;
    private boolean gender;


    public Person(String name, int age, boolean gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person() {
        this.name = "Jane Doe";
        this.age = 30;
        this.gender = false;
    }

    public void getGoal(){
        System.out.println("my goal is: Live for the moment!");
    }

    public void introduce(){
        System.out.println("Hi I'm " + name + ", a " + age + " old " + (gender ? "male" : "female") + ".");
    }
}
