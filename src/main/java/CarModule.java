/**
 * Created by John on 10/13/16.
 */
public abstract class CarModule {
    private long id;

    public CarModule(long id) {
        this.id = id;
    }

    public CarModule() {
    }

    public long getId() {
        return id;
    }
}
