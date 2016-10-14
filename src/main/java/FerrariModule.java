import dagger.Module;
import dagger.Provides;

/**
 * Created by John on 10/12/16.
 */
@Module
public class FerrariModule extends CarModule {

    public FerrariModule(long id) {
        super(id);
    }

    @Provides
    public Engine provideEngine() {
        return new V8();
    }
}
