package retrofit2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import retrofit2.CallAdapter;

class BuiltInFactories {

    public static final class Java8 extends BuiltInFactories {
        public List a(Executor executor) {
            return Arrays.asList(new CallAdapter.Factory[]{new CompletableFutureCallAdapterFactory(), new DefaultCallAdapterFactory(executor)});
        }

        public List b() {
            return Collections.singletonList(new OptionalConverterFactory());
        }
    }

    public List a(Executor executor) {
        return Collections.singletonList(new DefaultCallAdapterFactory(executor));
    }

    public List b() {
        return Collections.emptyList();
    }
}
