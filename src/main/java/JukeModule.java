import dagger.Module;
import dagger.Provides;

/**
 * Created by John on 10/12/16.
 */
@Module
public class JukeModule extends CarModule {

    public JukeModule(long id) {
        super(id);
    }

    @Provides
    public Engine provideEngine() {
        return new FourCylinder();
    }
}
