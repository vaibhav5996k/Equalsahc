package EqualsAndHashCode;

public class Car {

    private String owner;
    private String madeby;
    private String colour;

    public Car(String owner, String madeby, String colour) {
        this.owner = owner;
        this.madeby = madeby;
        this.colour = colour;
    }
    @Override
    public boolean equals(Object obj){
        return false;
    }
}
