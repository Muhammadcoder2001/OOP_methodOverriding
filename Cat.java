package OOP_overriding;

public class Cat extends Animal{

    private String  name;
    private  String sound;

    public Cat () {
        this.name = "Molly";
    }

    @Override
    public void sound() {
        super.sound();
        System.out.println("meow meow");
    }

    @Override
    public void getName(){
        super.getName();
        System.out.println(this.name);

    }
}
