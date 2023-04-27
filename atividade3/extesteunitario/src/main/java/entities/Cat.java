package entities;

public class Cat extends Animal {
    private String color;

    public Cat(){
    }

    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String setColor(String color) {
        return this.color = color;
    }

    @Override
    public String makeNoise(){
        return "meow meow";
    }
}
