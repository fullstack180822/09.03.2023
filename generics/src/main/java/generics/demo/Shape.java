package generics.demo;

import lombok.Getter;

public class Shape {

    @Getter
    protected String name;

    public Shape(String name) {
        this.name = name;
    }
}
