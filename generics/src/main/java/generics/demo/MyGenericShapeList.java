package generics.demo;

import lombok.Getter;

import java.util.ArrayList;

public class MyGenericShapeList<T extends Shape> {

    @Getter
    ArrayList<T> shapes;

}
