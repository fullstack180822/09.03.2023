package generics.demo;

public class AnyData<T> {

    protected final T data;

    public AnyData(T data) {
        this.data = data;
    }

    public T getData() {
        return this.data;
    }

}
