public class Animal {
    private String name;
    private String colour;

    public Animal(String name, String colour) {
        this.name = name;
        this.colour = colour;
    }

    public void run() {
        System.out.println("Mi nombre es " + name + " y soy de color " + colour);
        System.out.println("I'm running");
    }

}
