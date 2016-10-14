import dagger.Component;

import javax.inject.Inject;

/**
 * Created by John on 10/12/16.
 */
public class CarApp {

    @Component(modules = JukeModule.class)
    interface CarMakerComponent {
        Car maker();
    }


    public static void main(String[] args) {
        CarMakerComponent component = DaggerCarApp_CarMakerComponent.builder().jukeModule(new JukeModule(1234)).build();
        Car car = component.maker();
        car.accelerate();
    }
}
