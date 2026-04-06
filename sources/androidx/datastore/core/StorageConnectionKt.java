package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata
public final class StorageConnectionKt {
    public static final Object a(StorageConnection storageConnection, Continuation continuation) {
        return storageConnection.e(new StorageConnectionKt$readData$2((Continuation) null), continuation);
    }
}
