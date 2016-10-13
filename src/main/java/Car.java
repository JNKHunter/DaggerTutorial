import javax.inject.Inject;

/**
 * Created by John on 10/12/16.
 */
public class Car {

    private final Engine engine;

    @Inject
    public Car(Engine engine) {

        this.engine = engine;
    }

    public void accelerate() {
        engine.work();
    }
}
