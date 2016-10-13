import dagger.Module;
import dagger.Provides;

/**
 * Created by John on 10/12/16.
 */
@Module
public class FerrariModule {

    @Provides
    static Engine provideEngine() {
        return new V8();
    }

}
