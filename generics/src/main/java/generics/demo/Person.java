package generics.demo;

public class Person implements Comparable<Person> {

    protected int id;
    protected String name;
    protected float height;

    @Override
    public int compareTo(Person o) {
        return 0;
    }
}
