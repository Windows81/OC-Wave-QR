package androidx.datastore.core.okio;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import okio.BufferedSink;
import okio.BufferedSource;

@Metadata
public interface OkioSerializer<T> {
    Object a();

    Object b(BufferedSource bufferedSource, Continuation continuation);

    Object c(Object obj, BufferedSink bufferedSink, Continuation continuation);
}
