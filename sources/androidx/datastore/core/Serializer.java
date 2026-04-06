package androidx.datastore.core;

import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata
public interface Serializer<T> {
    Object a();

    Object b(Object obj, OutputStream outputStream, Continuation continuation);

    Object c(InputStream inputStream, Continuation continuation);
}
