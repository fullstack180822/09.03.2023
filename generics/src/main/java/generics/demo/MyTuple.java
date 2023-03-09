package generics.demo;

import lombok.Getter;

public class MyTuple<T1, T2> {

    @Getter
    private final T1 data1;

    @Getter
    private final T2 data2;

    public MyTuple(T1 data1, T2 data2) {
        this.data1 = data1;
        this.data2 = data2;
    }

    public boolean compare(MyTuple<T1, T2> other) {
        return this.data1.equals(other.data1) && this.data2.equals(other.data2);
    }
}
