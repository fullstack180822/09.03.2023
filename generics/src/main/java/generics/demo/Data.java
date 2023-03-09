package generics.demo;

public class Data<D extends Number>  implements DataGetter<D> {

    protected final D data;

    public Data(D data) {
        this.data = data;
    }

    @Override
    public D getData() {
        return this.data;
    }

}
