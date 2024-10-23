public class Cat {

    static String species = "Feline";
    public String name;
    private String color;
    protected int age;

    public Cat(String name, String color, int age){
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public Cat(){
        name = "Unknown";
        color = "Unknown";
        age = 0;
    }

    public String getColor(){
        return color;
    }

    public void displayAnimalInfo() {
        System.out.println("Name: " + name + " color: " + color + " Age: " + age);
    }

    static void displaySpecies() {
        System.out.println("species" + species);
    }

}
