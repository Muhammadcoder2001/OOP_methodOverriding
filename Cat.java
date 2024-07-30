package OOP_overriding;

public class Cat extends Animal{

    private String  name;
    private  String sound;

    public Cat () {
        this.name = "Molly";
        this.sound = "meow meow";
    }

    @Override
    public void sound() {
        super.sound();
        System.out.println(this.sound);
    }

    @Override
    public void getName(){
        super.getName();
        System.out.println(this.name);

    }
}
