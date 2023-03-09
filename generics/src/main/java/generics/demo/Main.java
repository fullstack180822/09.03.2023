package generics.demo;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        MyListObj list1 = new MyListObj();
        list1.addItem(3);
        list1.addItem("hello");
        Integer x = (Integer)list1.getItem(1);

        int y = 1; // int

        MyGenericList<Integer> int_list = new MyGenericList<>();
        int_list.addItem(3);

        MyGenericList<Float> float_list = new MyGenericList<>();
        float_list.addItem(5.4f);

        // Error:
        //MyGenericList<String> string_list = new MyGenericList<>();


        // Targril:
        // create a generic class called Data (T must be a number)
        // in this data get a readonly member in type T
        // get the value in the ctor
        //   create a getter property for this value
        // create a field of this type (Integer) with value 1
        // create a field of this type (Float) with value 3.14f
        // create an array-list of this type

        Data<Integer> data_int = new Data<>(3);
        Data<Float> data_float = new Data<>(3.14f);
        ArrayList<Data<Integer>> list_of_integers = new ArrayList<>();
        list_of_integers.add(data_int);
        list_of_integers.add(new Data<>(10));

        System.out.println("========================");
        for (var data : list_of_integers) {
            System.out.println(data.getData());
        }

        // Error:
        // Integer i2 = (Integer)3.14f; // this does not work!
        int i1 = (int)3.14f;

        list_of_integers.add(new Data<Integer>(data_float.getData().intValue()));

        PrintAnyData(new AnyData<Integer>(3));
        PrintAnyData(new AnyData<Number>(3));

        MyGenericShapeList<Shape> shapes = new MyGenericShapeList<>();
        MyGenericShapeList<Shape2D> shapes2D = new MyGenericShapeList<>();
        MyGenericShapeList<Rectangle> rectangles = new MyGenericShapeList<>();
        copyLists(rectangles, shapes2D);
    }

    public static void PrintAnyData(AnyData<? extends Number> data) {

    }

    public static void copyLists(MyGenericShapeList<? extends Shape2D> src,
                                 MyGenericShapeList<? super Shape2D> dest) {
        Shape shape = new Shape("oval");

        Shape2D shape2D = new Shape2D("rectangle", 30.6);

        Shape clone = new Shape(shape2D.getName()); // Shape2D ==> Shape
        Shape2D clone_super = new Shape2D(shape.getName(), Double.NaN); // Shape ==> Shape2D ==> missing data!!!!

        dest.getShapes().add(new Shape2D("1", 1));


        //for (int i = 0; i < src.size(); i++)
//            dest.add( src.get(i) );

        // ArrayList<Integer, String>

        MyTuple<Integer, Float> tuple_int_float = new MyTuple<>(1, 3.14f);
        //tuple_int_float.compare(new MyTuple<String, String>("1", "2"));
        tuple_int_float.compare(new MyTuple<Integer, Float>(1, 3.14f));

    }


}
