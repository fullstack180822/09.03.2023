package generics.demo;

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

        //MyGenericList<String> string_list = new MyGenericList<>();


        // Targril:
        // create a generic class called Data (T must be a number)
        // in this data get a readonly member in type T
        // get the value in the ctor
        //   create a getter property for this value
        // create a field of this type (Integer) with value 1
        // create a field of this type (Float) with value 3.14f
        // create an array-list of this type

    }

}
