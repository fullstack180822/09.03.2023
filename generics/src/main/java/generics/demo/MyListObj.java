package generics.demo;

import java.util.ArrayList;

public class MyListObj {

    ArrayList<Object> items;

    public void addItem(Object item) {
        items.add(item);
    }

    public Object getItem(int index) {
        return 0;
    }

    public void removeItem(Object item) {
        items.remove(item);
    }

    public int countSimilarItems(Object item) {
        return 0;
    }

}
