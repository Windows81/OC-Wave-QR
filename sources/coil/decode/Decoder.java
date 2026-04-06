package coil.decode;

import coil.ImageLoader;
import coil.fetch.SourceResult;
import coil.request.Options;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata
public interface Decoder {

    @Metadata
    public interface Factory {
        Decoder a(SourceResult sourceResult, Options options, ImageLoader imageLoader);
    }

    Object a(Continuation continuation);
}
