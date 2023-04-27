package entities;

public class Animal {
    private String name;
    private int age;

    public Animal(){

    }
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String setName(String name) {
        return this.name = name;
    }

    public int getAge() {
        return age;
    }

    public int setAge(int age) {
        return this.age = age;
    }

    public String makeNoise(){
        return "noise";
    }
}