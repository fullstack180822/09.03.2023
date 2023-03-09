package generics.demo;

import lombok.Getter;

public class Shape2D extends Shape {

    @Getter
    protected double area;

    public Shape2D(String name, double area) {
        super(name);
        this.area = area;
    }

}
