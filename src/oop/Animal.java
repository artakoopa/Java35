package oop;

public class Animal {

    //Fields
    private String type;
    private int avgLifeSpan;
    private double weight;

    //Constructor
    public Animal(String type, int avgLifeSpan, double weight){
        this.type = type;
        this.avgLifeSpan = avgLifeSpan;
        this.weight = weight;

    }
    public Animal(){

    }

    public Animal(String type, int avgLifeSpan){
        this.type = type;
        this.avgLifeSpan = avgLifeSpan;

    }

    public void printAnimalInfo(){
        System.out.println("Type: " + type);
        System.out.println("Average lifespan: " + avgLifeSpan);
        System.out.println("Weight: " + weight);
    }
}
