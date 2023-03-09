package coll1.example;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(3);
        ints.add(7);
        ints.add(2);

        MyList<Integer> my_list = new MyList<>();
        //for (var data : my_list) {
        //}

        for (var data : ints) {
            System.out.println(data);
            // ERROR!
            //if (data == 3) {
              //  ints.remove(data);
            //}
        }

        System.out.println("===========================");

        ints.forEach(data -> System.out.println(data));

        System.out.println("===========================");

        Iterator<Integer> my_iter = ints.iterator();
        while (my_iter.hasNext()) {
            Integer data = my_iter.next();
            System.out.println(data);
            if (data == 3) {
                my_iter.remove();
            }
       }
        System.out.println(ints);

        Set<Integer> int_set = new HashSet<>();
        int_set.add(3);
        int_set.add(3);
        int_set.add(3);
        System.out.println(int_set);

        HashMap<Object, Object> map = new HashMap<>();
        MyList<Integer> my_list2 = new MyList<>();
        map.put(map, 1);

        ArrayList<String> words = new ArrayList<>();
        words.add("aba");
        words.add("tel aviv");
        words.add("aba");
        words.add("aba");
        words.add("tel aviv");
        words.add("Hertzelliya");

        HashMap<String, Integer> counter_words = new HashMap<>();
        
        for (String one_word : words) {
            if (!counter_words.containsKey(one_word)) {
                counter_words.put(one_word, 0);
            }
            counter_words.replace(one_word, counter_words.get(one_word) + 1);
        }

        for (var entry: counter_words.entrySet()) {
            System.out.format("word = %s, count = %d \n", entry.getKey(), entry.getValue());
        }
    }

}
