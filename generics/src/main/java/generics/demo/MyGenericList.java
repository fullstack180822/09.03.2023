package generics.demo;

import java.util.ArrayList;

public class MyGenericList<T extends Number> {

    ArrayList<T> items = new ArrayList<>();

    public void addItem(T item) {

        items.add(item);
    }

    public T getItem(int index) {
        return null;
    }

    public void removeItem(T item) {
        items.remove(item);
    }

    public int countSimilarItems(Integer item) {
        return 0;
    }

}
