package generics.demo;

import java.util.ArrayList;

public class MyListFloat {

    ArrayList<Float> items;

    public void addItem(Float item) {
        items.add(item);
    }

    public void removeItem(Float item) {
        items.remove(item);
    }

    public int countSimilarItems(Float item) {
        return 0;
    }

}
