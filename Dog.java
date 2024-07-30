package OOP_overriding;

public class Dog extends Animal{

    private String sound;
    private String name;

    public Dog(){
        this.name = "Bella";
        this.sound = "bow bow";

    }

    @Override
    public void sound() {
        super.sound();
        System.out.println(this.sound);

    }

    @Override
    public void getName() {
        super.getName();
        System.out.println(this.name);
    }
}
