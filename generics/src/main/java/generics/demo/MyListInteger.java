package generics.demo;

import java.util.ArrayList;

public class MyListInteger {

    ArrayList<Integer> items;

    public void addItem(Integer item) {
        items.add(item);
    }

    public void removeItem(Integer item) {
        items.remove(item);
    }

    public int countSimilarItems(Integer item) {
        return 0;
    }

}
