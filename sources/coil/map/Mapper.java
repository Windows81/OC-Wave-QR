package coil.map;

import coil.request.Options;
import kotlin.Metadata;

@Metadata
public interface Mapper<T, V> {
    Object a(Object obj, Options options);
}
