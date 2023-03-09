package generics.demo;

import lombok.Getter;

public class Rectangle extends Shape2D {

    @Getter
    protected float height;
    @Getter
    protected float width;

    public Rectangle(String name, double area, float height, float width) {
        super(name, area);
        this.height = height;
        this.width = width;
    }
}
