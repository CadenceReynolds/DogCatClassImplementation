public class Dog {

    static String species = "Canine";
    public String name;
    private String breed;
    protected int age;

    public Dog(String name, String breed, int age){
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public Dog(){
        name = "unknown";
        breed = "unknown";
        age = 0;
    }

    public String getBreed() {
        return breed;
    }

    public void displayAnimalInfo() {
        System.out.println("Name: " + name + " Breed: " + breed + " Age: " + age);
    }

    static void displaySpecies() {
        System.out.println("species" + species);
    }


}
