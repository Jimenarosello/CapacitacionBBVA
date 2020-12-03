package main.granja;

public class Cow {

    private String name;
    private int age;
    private float weight;

    // Constructor
    public Cow(String name, int age, float weight) {
        this.name = name;
        this.age = age;
        if (weight > 5) {
            this.weight = weight;
        } else {
            throw new RuntimeException("El peso no puede ser menor a 5");
        }
    }

    public String callByName(String name) {
        String response;
        if (name.equals(this.name)) {
            response = "Moooo";
        } else {
            response = "";
        }
        return response;
    }

    public String eat() {
        return "Estoy comiendo pasto";
    }

    public String weigh() {
        return String.format("Peso %s kilos", weight);
    }

}
