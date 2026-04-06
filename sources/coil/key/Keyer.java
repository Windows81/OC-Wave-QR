package coil.key;

import coil.request.Options;
import kotlin.Metadata;

@Metadata
public interface Keyer<T> {
    String a(Object obj, Options options);
}
