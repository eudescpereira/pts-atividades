package entities;

public class Bird extends Animal{

    private String type;

    public Bird(){
    }

    public Bird(String name, int age, String type) {
        super(name, age);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String makeNoise(){
        return "singing";
    }

}
