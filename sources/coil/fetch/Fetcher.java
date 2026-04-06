package coil.fetch;

import coil.ImageLoader;
import coil.request.Options;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata
public interface Fetcher {

    @Metadata
    public interface Factory<T> {
        Fetcher a(Object obj, Options options, ImageLoader imageLoader);
    }

    Object a(Continuation continuation);
}
